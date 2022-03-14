package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.CommentsDao;
import org.sanity.instagraph.data.mappers.impl.GetCommentsAndUsersDtoMapper;
import org.sanity.instagraph.data.models.GetCommentsAndUsersDto;

import java.util.List;
import java.util.stream.Collectors;

public class CommentsDaoImpl extends BaseDao implements CommentsDao {
    public CommentsDaoImpl() {
        super();
    }

    @Override
    public List<GetCommentsAndUsersDto> getCommentsAndUsers() {
        String query = "SELECT c.id,CONCAT(u.username,' : ',c.content) AS full_comment " +
                "FROM comments as c " +
                "INNER JOIN users as u " +
                "WHERE u.id = c.user_id " +
                "ORDER BY c.id DESC;";

        return super.executeQuery(query, new GetCommentsAndUsersDtoMapper())
                .stream()
                .map(entry -> (GetCommentsAndUsersDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }
}
