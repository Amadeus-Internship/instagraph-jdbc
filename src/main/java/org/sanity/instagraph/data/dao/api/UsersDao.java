package org.sanity.instagraph.data.dao.api;

import org.sanity.instagraph.data.models.*;

import java.util.List;

public interface UsersDao {
    List<GetUsersDto> getUsers();

    List<GetCheatersDto> getCheaters();

    List<GetProfilePicturesDto> getProfilePictures();

    GetMostPopularUserDto getMostPopularUser();

    List<GetCommentingMyselfDto> getCommentingMyself();

    List<GetUserTopPostsDto> getUserTopPosts();
}
