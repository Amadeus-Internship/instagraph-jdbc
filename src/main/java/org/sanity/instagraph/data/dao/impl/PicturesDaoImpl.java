package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PicturesDao;
import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;

import java.util.List;

public class PicturesDaoImpl extends BaseDao implements PicturesDao {
    public PicturesDaoImpl() {
        super();
    }

    @Override
    public List<GetHighQualityPicturesDto> getHighQualityPictures() {
        return null;
    }
}
