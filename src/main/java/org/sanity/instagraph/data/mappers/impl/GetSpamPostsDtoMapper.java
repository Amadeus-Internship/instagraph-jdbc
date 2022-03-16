package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetSpamPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetSpamPostsDtoMapper implements Mapper {


    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        return new GetSpamPostsDto(){{
            setId(resultSet.getInt("id"));
            setCaption(resultSet.getString("caption"));
            setComments(resultSet.getInt("comments"));
        }};
    }
}
