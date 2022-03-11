package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.CommentsDao;
import org.sanity.instagraph.data.models.GetCommentsAndUsersDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CommentsDaoImpl extends BaseDao implements CommentsDao {
    public CommentsDaoImpl() {
        super();
    }

    @Override
    public List<GetCommentsAndUsersDto> getCommentsAndUsers() {
        return null;
    }
}
