package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PostsDao;
import org.sanity.instagraph.data.models.Post;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.stream.Collectors;

public class PostsDaoImpl extends BaseDao implements PostsDao {

    public PostsDaoImpl() {
        super();
    }

    @Override
    protected Object mapObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String caption = resultSet.getString("caption");
        int userId = resultSet.getInt("user_id");
        int pictureId = resultSet.getInt("picture_id");

        Post post = new Post();

        post.setId(id);
        post.setCaption(caption);
        post.setUserId(userId);
        post.setPictureId(pictureId);

        return post;
    }

    @Override
    public Collection<Post> queryEntities(String sqlQuery) {
        return this.executeQuery(sqlQuery)
                .stream()
                .map(obj -> (Post) obj)
                .collect(Collectors.toUnmodifiableSet());
    }
}
