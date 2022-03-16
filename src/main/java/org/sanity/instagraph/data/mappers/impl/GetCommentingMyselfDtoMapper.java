package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetCommentingMyselfDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCommentingMyselfDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
         return new GetCommentingMyselfDto(){{
            setId(resultSet.getInt("id"));
            setUsername(resultSet.getString("username"));
            setMyComments(resultSet.getInt("my_comments"));
         }};
    }
}
