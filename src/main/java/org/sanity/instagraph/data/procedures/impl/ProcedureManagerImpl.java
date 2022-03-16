package org.sanity.instagraph.data.procedures.impl;

import org.sanity.instagraph.data.dao.impl.CoreDaoImpl;
import org.sanity.instagraph.data.mappers.api.GetFilterPostsDtoMapper;
import org.sanity.instagraph.data.models.GetFilterPostsDto;
import org.sanity.instagraph.data.models.PostProcedureCallDto;
import org.sanity.instagraph.data.procedures.ProcedureManager;

import java.util.List;
import java.util.stream.Collectors;

public class ProcedureManagerImpl implements ProcedureManager {
    public final CoreDaoImpl coreDao;

    public ProcedureManagerImpl(CoreDaoImpl coreDao) {
        this.coreDao = coreDao;
    }


    @Override
    public void definePostProcedure() {
        String query =
                "CREATE PROCEDURE udp_post " +
                        "    (username VARCHAR(255), password VARCHAR(255), caption VARCHAR(255), path VARCHAR(255)) " +
                        "BEGIN " +
                        "    START TRANSACTION; " +
                        " " +
                        "    IF ((SELECT u.password FROM users AS u WHERE u.username = username) <> password) THEN " +
                        "        SIGNAL SQLSTATE '45000'  " +
                        "            SET MESSAGE_TEXT = 'Password is incorrect!'; " +
                        "        ROLLBACK; " +
                        "    ELSEIF ((SELECT count(p.id) FROM pictures AS p WHERE p.path = path) <> 1) THEN " +
                        "        SIGNAL SQLSTATE '45000'  " +
                        "            SET MESSAGE_TEXT = 'The picture does not exist!'; " +
                        "        ROLLBACK; " +
                        "    ELSE " +
                        "        INSERT INTO posts  " +
                        "            (caption, user_id, picture_id) " +
                        "            SELECT caption, " +
                        "            (SELECT u.id FROM users AS u WHERE u.username = username), " +
                        "             (SELECT p.id FROM pictures AS p WHERE p.path = path); " +
                        "        COMMIT; " +
                        "    END IF; " +
                        "END";

        this.coreDao.executeBlankQuery(query);
    }

    @Override
    public void defineFilterProcedure() {
        String query =
                "CREATE PROCEDURE udp_filter(hashtag VARCHAR(255)) " +
                        "BEGIN " +
                        "    SELECT p.id, p.caption, u.username AS user  " +
                        "    FROM posts AS p " +
                        "    JOIN users AS u " +
                        "    ON p.user_id = u.id " +
                        "    WHERE p.caption LIKE CONCAT('%','#', hashtag,'%'); " +
                        "  END;";

        this.coreDao.executeBlankQuery(query);
    }

    @Override
    public List<GetFilterPostsDto> executeFilterProcedure(String hashtag) {

        String callableSql = "CALL udp_filter(" + '\'' + hashtag + '\'' + ")";

        return this.coreDao.executeCallable(callableSql, new GetFilterPostsDtoMapper())
                .stream()
                .map(entry -> (GetFilterPostsDto) entry)
                .collect(Collectors.toUnmodifiableList());

    }

    @Override
    public void executePostProcedure(PostProcedureCallDto postProcedureCallModel) {
        String callableSql = "CALL udp_post(" +
                '\'' + postProcedureCallModel.getUsername() + '\'' + ", " +
                '\'' + postProcedureCallModel.getPassword() + '\'' + ", " +
                '\'' + postProcedureCallModel.getCaption() + '\'' + ", " +
                '\'' + postProcedureCallModel.getPath() + '\'' + ")";

        this.coreDao.executeCallable(callableSql, null);
    }

}
