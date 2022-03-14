package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetMostPopularUserDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetMostPopularUserDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetMostPopularUserDto dto = new GetMostPopularUserDto();

        dto.setId(resultSet.getInt("id"));
        dto.setUsername(resultSet.getString("username"));
        dto.setPosts(resultSet.getInt("posts"));
        dto.setFollowers(resultSet.getInt("followers"));

        return dto;
    }
}
