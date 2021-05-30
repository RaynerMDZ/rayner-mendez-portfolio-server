package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/post/")
@CrossOrigin(value = "${cross.origin.url}")
public class PostController {

    private final PostService postService;

    @PostMapping(value = "save")
    public ResponseEntity<Post> savePost(Post post) {
        return null;
    }

    @GetMapping(value = "{userId}/user-posts")
    public ResponseEntity<List<Post>> getAllPostsByUserId(@PathVariable(value = "userId") UUID userId) {
        return null;
    }

    @GetMapping(value = "{postId}")
    public ResponseEntity<Post> getPostById(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @PatchMapping(value = "update")
    public ResponseEntity<Post> updatePost(Post post) {
        return null;
    }

    @PutMapping(value = "{postId}/delete")
    public ResponseEntity<Boolean> deletePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @PutMapping(value = "{postId}/activate")
    public ResponseEntity<Boolean> activatePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @PutMapping(value = "{postId}/deactivate")
    public ResponseEntity<Boolean> deactivatePost(@PathVariable(value = "postId") UUID postId) {
        return null;
    }
}
