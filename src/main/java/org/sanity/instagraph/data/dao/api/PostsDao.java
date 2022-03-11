package org.sanity.instagraph.data.dao.api;

import org.sanity.instagraph.data.models.GetPostsAndCommentatorsDto;
import org.sanity.instagraph.data.models.GetSpamPostsDto;

import java.util.List;

public interface PostsDao {
    List<GetSpamPostsDto> getSpamPosts();

    List<GetPostsAndCommentatorsDto> getPostsAndCommentators();
}
