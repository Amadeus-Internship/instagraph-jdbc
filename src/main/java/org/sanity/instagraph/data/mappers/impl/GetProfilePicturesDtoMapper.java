package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetProfilePicturesDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetProfilePicturesDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetProfilePicturesDto dto = new GetProfilePicturesDto();

        dto.setId(resultSet.getInt("id"));
        dto.setUsername(resultSet.getString("username"));
        dto.setSize(resultSet.getString("size"));

        return dto;
    }
}
