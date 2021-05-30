package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class PictureController {

    @GetMapping(value = "{postId}/pictures")
    public ResponseEntity<List<Picture>> getAllPicturesByPostId(@PathVariable("postId") UUID postId) {

        System.out.println(postId);
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @GetMapping(value = "{postId}/post-main-picture")
    public ResponseEntity<Picture> getPostPictureByPostId(@PathVariable("postId") UUID postId) {

        return new ResponseEntity<>(new Picture(), HttpStatus.OK);
    }

    @PostMapping(
            value = "{postId}/post-main-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<Boolean> savePostMainPicture(@PathVariable("postId") UUID postId,
                                                       @RequestParam("picture") MultipartFile picture) {

        return null;
    }

    @PostMapping(
            value = "{postId}/post-picture",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<Boolean> savePostPicture(@PathVariable("postId") UUID postId,
                                                   @RequestParam("picture") MultipartFile picture) {
        System.out.println(postId.toString());

        System.out.println(picture.getOriginalFilename());

        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @PatchMapping(
            value = "{postId}/post-picture/{pictureId}/update",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<Boolean> updatePostPicture(@PathVariable("postId") UUID postId,
                                                     @PathVariable("pictureId") UUID pictureId,
                                                     @RequestParam("picture") MultipartFile picture) {

        return null;
    }
}
