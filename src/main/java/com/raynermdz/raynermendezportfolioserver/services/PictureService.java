package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PictureService {
    Optional<List<Picture>> getAllPicturesByPostId(UUID postId);
    Optional<Picture> getPostPictureById(UUID pictureId);
    Optional<Picture> savePostPicture(UUID postId, MultipartFile picture);
    Optional<Picture> updatePostPicture(UUID postId, MultipartFile picture);
    Optional<Picture> savePostMainPicture(UUID postId, MultipartFile picture);
    Optional<Picture> updatePostMainPicture(UUID postId, MultipartFile picture);
    Optional<Picture> saveUserPicture(UUID userId, MultipartFile picture);
    Optional<Picture> updateUserPicture(UUID userId, MultipartFile picture);
    Boolean deletePostPicture(UUID postId, UUID pictureId);
    Boolean activatePostPicture(UUID postId, UUID pictureId);
    Boolean deactivatePostPicture(UUID postId, UUID pictureId);
    Boolean deletePostMainPicture(UUID postId, UUID pictureId);
    Boolean activatePostMainPicture(UUID postId, UUID pictureId);
    Boolean deactivatePostMainPicture(UUID postId, UUID pictureId);
    Boolean deleteUserPicture(UUID userId, UUID pictureId);
    Boolean activateUserPicture(UUID userId, UUID pictureId);
    Boolean deactivateUSerPicture(UUID userId, UUID pictureId);
}
