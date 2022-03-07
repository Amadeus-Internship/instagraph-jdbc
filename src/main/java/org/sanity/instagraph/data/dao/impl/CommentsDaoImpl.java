package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.CommentsDao;
import org.sanity.instagraph.data.models.Comment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.stream.Collectors;

public class CommentsDaoImpl extends BaseDao implements CommentsDao {
    public CommentsDaoImpl() {
        super();
    }

    @Override
    protected Object mapObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String content = resultSet.getString("content");
        int userId = resultSet.getInt("user_id");
        int postId = resultSet.getInt("post_id");

        Comment comment = new Comment();

        comment.setId(id);
        comment.setContent(content);
        comment.setUserId(userId);
        comment.setPostId(postId);

        return comment;
    }

    @Override
    public Collection<Comment> queryEntities(String sqlQuery) {
        return this.executeQuery(sqlQuery)
                .stream()
                .map(obj -> (Comment) obj)
                .collect(Collectors.toUnmodifiableSet());
    }
}
