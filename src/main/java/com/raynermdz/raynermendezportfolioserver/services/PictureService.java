package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PictureResponseDto;
import com.raynermdz.raynermendezportfolioserver.models.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PictureService {
    Optional<List<PictureResponseDto>> getAllPicturesByPostId(UUID postId);
    Optional<PictureResponseDto> getPostPictureById(UUID pictureId);
    Optional<PictureResponseDto> savePostPicture(UUID postId, MultipartFile picture);
    Optional<PictureResponseDto> updatePostPicture(UUID postId, MultipartFile picture);
    Optional<PictureResponseDto> savePostMainPicture(UUID postId, MultipartFile picture);
    Optional<PictureResponseDto> updatePostMainPicture(UUID postId, MultipartFile picture);
    Optional<PictureResponseDto> saveUserPicture(UUID userId, MultipartFile picture);
    Optional<PictureResponseDto> updateUserPicture(UUID userId, MultipartFile picture);
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
