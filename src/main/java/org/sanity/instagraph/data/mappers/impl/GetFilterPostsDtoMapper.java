package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetFilterPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFilterPostsDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetFilterPostsDto dto = new GetFilterPostsDto();

        dto.setId(resultSet.getInt("id"));
        dto.setCaption(resultSet.getString("caption"));
        dto.setUser(resultSet.getString("user"));

        return dto;
    }
}
