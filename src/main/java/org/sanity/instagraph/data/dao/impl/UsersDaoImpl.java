package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.UsersDao;
import org.sanity.instagraph.data.models.User;

import java.util.Collection;

public class UsersDaoImpl extends BaseDao implements UsersDao {

    public UsersDaoImpl() {
        super();
    }

    @Override
    public Collection<User> queryEntities(String sqlQuery) {
        this.executeQuery(sqlQuery);
        return null;
    }
}
