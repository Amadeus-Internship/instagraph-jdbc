package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetHighQualityPicturesDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {
        GetHighQualityPicturesDto dto = new GetHighQualityPicturesDto();

        dto.setId(resultSet.getInt("id"));
        dto.setPath(resultSet.getString("path"));
        dto.setSize(Double.parseDouble(resultSet.getString("size")));
        return null;
    }
}
