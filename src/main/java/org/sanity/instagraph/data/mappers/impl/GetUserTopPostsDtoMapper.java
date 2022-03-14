package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetUserTopPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetUserTopPostsDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetUserTopPostsDto dto = new GetUserTopPostsDto();

        dto.setId(resultSet.getInt("id"));
        dto.setUsername(resultSet.getString("username"));
        dto.setPost(resultSet.getString("post"));

        return dto;
    }
}
