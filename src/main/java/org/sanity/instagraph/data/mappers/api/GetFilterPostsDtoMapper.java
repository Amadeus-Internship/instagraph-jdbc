package org.sanity.instagraph.data.mappers.api;

import org.sanity.instagraph.data.models.GetFilterPostsDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFilterPostsDtoMapper implements Mapper{
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        return new GetFilterPostsDto(){{
            setId(resultSet.getInt("id"));
            setCaption(resultSet.getString("caption"));
            setUser(resultSet.getString("user"));
        }};
    }
}
