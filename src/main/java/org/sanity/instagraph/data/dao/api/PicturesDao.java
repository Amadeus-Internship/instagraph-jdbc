package org.sanity.instagraph.data.dao.api;

import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;

import java.util.List;

public interface PicturesDao {
    List<GetHighQualityPicturesDto> getHighQualityPictures();
}
