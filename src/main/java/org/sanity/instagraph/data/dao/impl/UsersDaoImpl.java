package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.UsersDao;
import org.sanity.instagraph.data.mappers.impl.*;
import org.sanity.instagraph.data.models.*;

import java.util.List;
import java.util.stream.Collectors;

public class UsersDaoImpl extends BaseDao implements UsersDao {

    public UsersDaoImpl() {
        super();
    }

    @Override
    public List<GetUsersDto> getUsers() {
        String query = "SELECT u.id, u.username FROM users AS u " +
                "ORDER BY u.id ASC";

        return super.executeQuery(query, new GetUsersDtoMapper())
                .stream()
                .map(entry -> (GetUsersDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetCheatersDto> getCheaters() {
        String query = "SELECT u.id,u.username FROM users as u " +
                "INNER JOIN users_followers As uf " +
                "ON u.id = uf.user_id " +
                "WHERE user_id = follower_id " +
                "ORDER BY uf.user_id; ";

        return super.executeQuery(query, new GetCheatersDtoMapper())
                .stream()
                .map(entry -> (GetCheatersDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetUserTopPostsDto> getUserTopPosts() {
        String query = "SELECT u.id, u.username,p.caption " +
                "FROM users AS u " +
                "LEFT JOIN posts AS p " +
                "ON u.id = p.user_id " +
                "INNER JOIN comments AS c " +
                "ON p.id = c.post_id " +
                "GROUP BY u.id " +
                "ORDER BY u.id;";

        return super.executeQuery(query, new GetUserTopPostsDtoMapper())
                .stream()
                .map(entry -> (GetUserTopPostsDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetMostPopularUserDto> getMostPopularUser() {
        String query = "SELECT cf.id, u.username, COUNT(p.id) AS posts, cf.followers " +
                "FROM ( " +
                "SELECT uf.user_id AS id, " +
                "COUNT(uf.follower_id) AS followers " +
                "FROM users_followers AS uf " +
                "GROUP BY uf.user_id) AS cf " +
                "JOIN users AS u ON cf.id = u.id " +
                "LEFT JOIN posts AS p ON cf.id = p.user_id " +
                "GROUP BY cf.id " +
                "ORDER BY followers DESC , u.id " +
                "LIMIT 1;";

        return super.executeQuery(query, new GetMostPopularUserDtoMapper())
                .stream()
                .map(entry -> (GetMostPopularUserDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetCommentingMyselfDto> getCommentingMyself() {
        String query = "SELECT u.id,u.username, " +
                "SUM(IF(c.user_id = u.id, 1, 0)) AS my_comments " +
                "FROM users AS u\n" +
                "LEFT JOIN posts AS p ON u.id = p.user_id " +
                "LEFT JOIN comments AS c ON p.id = c.post_id " +
                "GROUP BY u.id " +
                "ORDER BY my_comments DESC , u.id;";

        return super.executeQuery(query, new GetCommentingMyselfDtoMapper())
                .stream()
                .map(entry -> (GetCommentingMyselfDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

}
