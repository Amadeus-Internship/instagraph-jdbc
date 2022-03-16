package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetCommentsAndUsersDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCommentsAndUsersDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {

        return new GetCommentsAndUsersDto(){{
           setId(resultSet.getInt("id"));
           setFullComment(resultSet.getString("full_comment"));
        }};

    }
}
