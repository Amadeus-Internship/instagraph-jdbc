package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PicturesDao;
import org.sanity.instagraph.data.mappers.impl.GetHighQualityPicturesDtoMapper;
import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;

import java.util.List;
import java.util.stream.Collectors;

public class PicturesDaoImpl extends BaseDao implements PicturesDao {
    public PicturesDaoImpl() {
        super();
    }

    @Override
    public List<GetHighQualityPicturesDto> getHighQualityPictures() {

        String query = "SELECT id,path,size " +
                "FROM pictures as p " +
                "WHERE size > 50000.00 AND (path LIKE '%jpeg' OR path LIKE '%png%') " +
                "ORDER BY p.size DESC;";

        return super.executeQuery(query, new GetHighQualityPicturesDtoMapper())
                .stream()
                .map(entity -> (GetHighQualityPicturesDto) entity)
                .collect(Collectors.toUnmodifiableList());
    }
}
