package org.sanity.instagraph.data.mappers.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;
import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetHighQualityPicturesDtoMapper implements Mapper {
    @Override
    public Object mapRow(ResultSet resultSet) throws SQLException {

           return  new GetHighQualityPicturesDto() {{

            setId(resultSet.getInt("id"));
            setSize(resultSet.getDouble("size"));
            setPath(resultSet.getString("path"));
        }};
    }
}
