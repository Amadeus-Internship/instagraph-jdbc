package org.sanity.instagraph.data.dao.api;

import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;
import org.sanity.instagraph.data.models.GetProfilePicturesDto;

import java.util.List;

public interface PicturesDao {

    List<GetHighQualityPicturesDto> getHighQualityPictures();

    List<GetProfilePicturesDto> getProfilePictures();
}
