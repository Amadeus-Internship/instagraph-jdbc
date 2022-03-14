package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.dao.api.PicturesDao;
import org.sanity.instagraph.data.mappers.impl.GetHighQualityPicturesDtoMapper;
import org.sanity.instagraph.data.mappers.impl.GetProfilePicturesDtoMapper;
import org.sanity.instagraph.data.models.GetHighQualityPicturesDto;
import org.sanity.instagraph.data.models.GetProfilePicturesDto;

import java.util.List;
import java.util.stream.Collectors;

public class PicturesDaoImpl extends BaseDao implements PicturesDao {
    public PicturesDaoImpl() {
        super();
    }


    @Override
    public List<GetHighQualityPicturesDto> getHighQualityPictures() {
        String query = "SELECT id,path,size FROM pictures as p " +
                "WHERE size > 50000.00 AND (path LIKE '%jpeg' OR path LIKE '%png%') " +
                "ORDER BY p.size DESC;";

        return super.executeQuery(query, new GetHighQualityPicturesDtoMapper())
                .stream()
                .map(entry -> (GetHighQualityPicturesDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<GetProfilePicturesDto> getProfilePictures() {
        String query = "SELECT u.id, u.username, CONCAT(p.size, 'KB') AS size FROM users AS u " +
                "JOIN pictures AS p " +
                "ON u.profile_picture_id = p.id " +
                "WHERE u.profile_picture_id IN (SELECT internal_users.profile_picture_id FROM users AS internal_users WHERE internal_users.id <> u.id)";

        return super.executeQuery(query, new GetProfilePicturesDtoMapper())
                .stream()
                .map(entry -> (GetProfilePicturesDto) entry)
                .collect(Collectors.toUnmodifiableList());
    }
}
