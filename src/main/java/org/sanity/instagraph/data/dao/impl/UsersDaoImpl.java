package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.UsersDao;
import org.sanity.instagraph.data.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.stream.Collectors;

public class UsersDaoImpl extends BaseDao implements UsersDao {

    public UsersDaoImpl() {
        super();
    }

    @Override
    protected Object mapObject(ResultSet resultSet) throws SQLException {
        int id = hasColumn(resultSet, "id") ? resultSet.getInt("id") : -1;
        String username = hasColumn(resultSet, "username") ? resultSet.getString("username") : null;
        String password = hasColumn(resultSet, "password") ? resultSet.getString("password") : null;
        int profilePictureId = hasColumn(resultSet, "profile_picture_id") ? resultSet.getInt("profile_picture_id") : -1;

        User user = new User();

        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setProfilePictureId(profilePictureId);

        return user;
    }

    @Override
    public Collection<User> queryEntities(String sqlQuery) {
        return this.executeQuery(sqlQuery)
                .stream()
                .map(obj -> (User) obj)
                .collect(Collectors.toUnmodifiableSet());
    }
}
