package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Picture;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PictureService {
    Picture savePicture(Picture picture);
    List<Picture> getAllPicturesByPostId(UUID postId);
    Optional<Picture> getPictureById(UUID pictureId);
    Optional<Picture> updatePicture(Picture picture);
    Boolean deletePicture(UUID pictureId);
    Boolean activatePicture(UUID pictureId);
    Boolean deactivatePicture(UUID pictureId);
}
