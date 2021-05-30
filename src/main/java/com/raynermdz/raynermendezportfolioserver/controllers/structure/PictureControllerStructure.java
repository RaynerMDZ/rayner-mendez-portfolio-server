package com.raynermdz.raynermendezportfolioserver.controllers.structure;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface PictureControllerStructure {

    @GetMapping(value = "{postId}/post-pictures")
    ResponseEntity<List<Picture>> getAllPicturesByPostId(@PathVariable(value = "postId") UUID postId);

    @GetMapping(value = "{pictureId}")
    ResponseEntity<Picture> getPostPicture(@PathVariable("pictureId") UUID pictureId);

    @PostMapping(
            value = "{postId}/post-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> savePostPicture(@PathVariable("postId") UUID postId,
                                            @RequestParam("picture") MultipartFile picture);
    @PutMapping(
            value = "{postId}/post-picture/{pictureId}",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> updatePostPicture(@PathVariable("postId") UUID postId,
                                              @PathVariable("pictureId") UUID pictureId,
                                              @RequestParam("picture") MultipartFile picture);

    @GetMapping(value = "{postId}/post-main-picture")
    ResponseEntity<Picture> getPostMainPictureByPostId(@PathVariable("postId") UUID postId);

    @PostMapping(
            value = "{postId}/post-main-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> savePostMainPicture(@PathVariable("postId") UUID postId,
                                                @RequestParam("picture") MultipartFile picture);

    @PutMapping(
            value = "{postId}/post-main-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> updatePostMainPicture(@PathVariable("postId") UUID postId,
                                                  @RequestParam("picture") MultipartFile picture);

    @GetMapping(value = "{userId}/user-picture")
    ResponseEntity<Picture> getUserPicture(@PathVariable("userId") UUID userId);

    @PostMapping(
            value = "{userId}/user-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> saveUserPicture(@PathVariable("userId") UUID postId,
                                            @RequestParam("picture") MultipartFile picture);

    @PutMapping(
            value = "{userId}/user-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    ResponseEntity<Picture> updateUserPicture(@PathVariable("userId") UUID userId,
                                              @RequestParam("picture") MultipartFile picture);

    @PatchMapping(value = "{pictureId}/delete")
    ResponseEntity<Boolean> deletePicture(@PathVariable(value = "pictureId") UUID pictureId);

    @PatchMapping(value = "{pictureId}/activate")
    ResponseEntity<Boolean> activatePicture(@PathVariable(value = "pictureId") UUID pictureId);

    @PatchMapping(value = "{pictureId}/deactivate")
    ResponseEntity<Boolean> deactivatePicture(@PathVariable(value = "pictureId") UUID pictureId);
}
