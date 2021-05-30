package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.controllers.structure.PictureControllerStructure;
import com.raynermdz.raynermendezportfolioserver.models.Picture;
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
    public ResponseEntity<List<Picture>> getAllPicturesByPostId(UUID postId) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> getPostPicture(UUID pictureId) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> savePostPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> updatePostPicture(UUID postId, UUID pictureId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> getPostMainPictureByPostId(UUID postId) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> savePostMainPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> updatePostMainPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> getUserPicture(UUID userId) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> saveUserPicture(UUID postId, MultipartFile picture) {
        return null;
    }

    @Override
    public ResponseEntity<Picture> updateUserPicture(UUID userId, MultipartFile picture) {
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
