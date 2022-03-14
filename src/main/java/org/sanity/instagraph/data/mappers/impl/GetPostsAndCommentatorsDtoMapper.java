package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetPostsAndCommentatorsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetPostsAndCommentatorsDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetPostsAndCommentatorsDto dto = new GetPostsAndCommentatorsDto();

        dto.setId(resultSet.getInt("id"));
        dto.setCaption(resultSet.getString("caption"));
        dto.setUsers(resultSet.getInt("users"));
        return dto;
    }
}
