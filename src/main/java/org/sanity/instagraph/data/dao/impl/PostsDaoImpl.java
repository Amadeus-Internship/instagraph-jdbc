package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PostsDao;
import org.sanity.instagraph.data.mappers.impl.GetPostsAndCommentatorsDtoMapper;
import org.sanity.instagraph.data.mappers.impl.GetSpamPostsDtoMapper;
import org.sanity.instagraph.data.models.GetPostsAndCommentatorsDto;
import org.sanity.instagraph.data.models.GetSpamPostsDto;

import java.util.List;
import java.util.stream.Collectors;

public class PostsDaoImpl extends BaseDao implements PostsDao {
    public PostsDaoImpl() {
        super();
    }

    @Override
    public List<GetSpamPostsDto> getSpamPosts(){
        String query = "SELECT p.id, p.caption, COUNT(c.id) AS 'comments' " +
                "FROM posts AS p " +
                "JOIN comments AS c ON p.id = c.post_id " +
                "GROUP BY p.id " +
                "ORDER BY comments DESC , p.id " +
                "LIMIT 5;";

        return super.executeQuery(query, new GetSpamPostsDtoMapper())
                .stream()
                .map(entry -> (GetSpamPostsDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetPostsAndCommentatorsDto> getPostsAndCommentators(){
        String query = "SELECT p.id, p.caption, COUNT(c.user_id) AS users " +
                "FROM posts AS p " +
                "LEFT JOIN comments AS c  " +
                "ON p.id = c.post_id " +
                "GROUP BY p.id " +
                "ORDER BY users DESC , p.id;";

        return  super.executeQuery(query, new GetPostsAndCommentatorsDtoMapper())
                .stream()
                .map(entry -> (GetPostsAndCommentatorsDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

}
