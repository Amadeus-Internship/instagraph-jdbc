package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PostsDao;
import org.sanity.instagraph.data.models.Post;

import java.util.Collection;

public class PostsDaoImpl extends BaseDao implements PostsDao {

    public PostsDaoImpl() {
        super();
    }

    @Override
    public Collection<Post> queryEntities(String sqlQuery) {
        this.executeQuery(sqlQuery);
        return null;
    }
}
