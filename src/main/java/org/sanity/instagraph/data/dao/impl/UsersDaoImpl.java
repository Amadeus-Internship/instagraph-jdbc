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
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        int profilePictureId = resultSet.getInt("profile_picture_id");

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
