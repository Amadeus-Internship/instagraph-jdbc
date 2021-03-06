package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetMostPopularUserDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetMostPopularUserDtoMapper implements Mapper {


    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        return new GetMostPopularUserDto(){{
            setId(resultSet.getInt("id"));
            setUsername(resultSet.getString("username"));
            setPosts(resultSet.getInt("posts"));
            setFollowers(resultSet.getInt("followers"));
        }};
    }
}
