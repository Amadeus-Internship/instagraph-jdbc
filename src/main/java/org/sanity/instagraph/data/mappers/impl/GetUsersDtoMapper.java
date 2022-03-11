package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetUsersDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetUsersDtoMapper implements Mapper {

    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetUsersDto dto = new GetUsersDto();

        dto.setId(resultSet.getInt("id"));
        dto.setUsername(resultSet.getString("username"));

        return dto;
    }
}
