package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.UsersDao;
import org.sanity.instagraph.data.mappers.impl.GetProfilePicturesDtoMapper;
import org.sanity.instagraph.data.mappers.impl.GetUsersDtoMapper;
import org.sanity.instagraph.data.models.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
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
        return null;
    }

    @Override
    public List<GetProfilePicturesDto> getProfilePictures() {
        String query = "SELECT u.id, u.username, CONCAT(p.size, 'KB') AS size FROM users AS u " +
                "JOIN pictures AS p " +
                "ON u.profile_picture_id = p.id " +
                "WHERE u.profile_picture_id IN (SELECT internal_users.profile_picture_id FROM users AS internal_users WHERE internal_users.id <> u.id)";

        return super.executeQuery(query, new GetProfilePicturesDtoMapper())
                .stream()
                .map(entry -> (GetProfilePicturesDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public GetMostPopularUserDto getMostPopularUser() {
        return null;
    }

    @Override
    public List<GetCommentingMyselfDto> getCommetingMyself() {
        return null;
    }

    @Override
    public List<GetUserTopPostsDto> getUserTopPosts() {
        return null;
    }
}
