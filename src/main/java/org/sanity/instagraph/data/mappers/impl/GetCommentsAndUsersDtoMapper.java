package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetCommentsAndUsersDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCommentsAndUsersDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetCommentsAndUsersDto dto = new GetCommentsAndUsersDto();

        dto.setId(resultSet.getInt("id"));
        dto.setFullComment(resultSet.getString("full_comment"));
        return dto;
    }
}
