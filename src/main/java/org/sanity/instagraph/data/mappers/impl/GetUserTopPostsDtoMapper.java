package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetUserTopPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetUserTopPostsDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        return new GetUserTopPostsDto(){{
           setId(resultSet.getInt("id"));
           setUsername(resultSet.getString("username"));
           setCaption(resultSet.getString("caption"));
        }};
    }
}
