package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.controllers.structure.PictureControllerStructure;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PictureResponseDto;
import com.raynermdz.raynermendezportfolioserver.services.PictureService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/pictures/")
@CrossOrigin("*")
public class PictureController implements PictureControllerStructure {

    private final PictureService pictureService;

    @Override
    public ResponseEntity<List<PictureResponseDto>> getAllPicturesByPostId(UUID postId) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> getPostPicture(UUID pictureId) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> savePostPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> updatePostPicture(UUID postId, UUID pictureId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> getPostMainPictureByPostId(UUID postId) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> savePostMainPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> updatePostMainPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> getUserPicture(UUID userId) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> saveUserPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<PictureResponseDto> updateUserPicture(UUID userId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> deletePicture(UUID pictureId) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> activatePicture(UUID pictureId) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> deactivatePicture(UUID pictureId) {
        return null;
    }
}
