package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetCheatersDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCheatersDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {


        return new GetCheatersDto() {{
            setId(resultSet.getInt("id"));
            setUsername(resultSet.getString("username"));
        }};
    }
}
