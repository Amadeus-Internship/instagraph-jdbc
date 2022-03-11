package org.sanity.instagraph.data.dao.api;

import org.sanity.instagraph.data.models.GetCommentsAndUsersDto;

import java.util.List;

public interface CommentsDao {
    List<GetCommentsAndUsersDto> getCommentsAndUsers();
}
