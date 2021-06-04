package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.PostRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PostResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/posts/")
@CrossOrigin(value = "${cross.origin.url}")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<PostResponseDto> savePost(PostRequestDto post) {
        return null;
    }

    @GetMapping(value = "{userId}/user-posts")
    public ResponseEntity<List<PostResponseDto>> getAllPostsByUserId(@PathVariable(value = "userId") UUID userId) {

        return new ResponseEntity<>(this.postService.getAllPostsByUserId(userId).get(), HttpStatus.OK);
    }

    @GetMapping(value = "{postId}")
    public ResponseEntity<PostResponseDto> getPostById(@PathVariable(value = "postId") UUID postId) throws EntityNotFoundException {
        return new ResponseEntity<>(this.postService.getPostById(postId).get(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PostResponseDto> updatePost(PostRequestDto post) {
        return null;
    }

    @DeleteMapping(value = "{postId}")
    public ResponseEntity<Boolean> deletePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @PatchMapping(value = "{postId}/activate")
    public ResponseEntity<Boolean> activatePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @PatchMapping(value = "{postId}/deactivate")
    public ResponseEntity<Boolean> deactivatePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }
}
