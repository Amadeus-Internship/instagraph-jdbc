package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetCommentingMyselfDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCommentingMyselfDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetCommentingMyselfDto dto = new GetCommentingMyselfDto();

        dto.setId(resultSet.getInt("id"));
        dto.setUsername(resultSet.getString("username"));
        dto.setMyComments(Integer.parseInt(resultSet.getString("comments")));
        return dto;
    }
}
