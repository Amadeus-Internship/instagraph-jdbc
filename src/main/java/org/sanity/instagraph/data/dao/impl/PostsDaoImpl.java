package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PostsDao;
import org.sanity.instagraph.data.models.GetPostsAndCommentatorsDto;
import org.sanity.instagraph.data.models.GetSpamPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PostsDaoImpl extends BaseDao implements PostsDao {
    public PostsDaoImpl() {
        super();
    }

    @Override
    public List<GetSpamPostsDto> getSpamPosts() {
        return null;
    }

    @Override
    public List<GetPostsAndCommentatorsDto> getPostsAndCommentators() {
        return null;
    }
}
