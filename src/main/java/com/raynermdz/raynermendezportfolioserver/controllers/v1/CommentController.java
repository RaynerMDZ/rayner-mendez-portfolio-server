package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.CommentRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.CommentResponseDto;
import com.raynermdz.raynermendezportfolioserver.services.CommentService;
import com.raynermdz.raynermendezportfolioserver.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/comments/")
@CrossOrigin(value = "${cross.origin.url}")
public class CommentController {

    private final CommentService commentService;

    @PostMapping(value = "{postId}")
    public ResponseEntity<CommentResponseDto> saveComment(@RequestBody CommentRequestDto comment,
                                                          @PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @GetMapping(value = "{postId}/post-comments")
    public ResponseEntity<List<CommentResponseDto>> getAllCommentsByPostId(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @GetMapping(value = "{commentId}")
    public ResponseEntity<CommentResponseDto> getCommentById(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PutMapping(value = "{postId}")
    public ResponseEntity<CommentResponseDto> updateComment(@RequestBody CommentRequestDto comment,
                                                            @PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @DeleteMapping(value = "{commentId}")
    public ResponseEntity<Boolean> deleteComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PatchMapping(value = "{commentId}/activate")
    public ResponseEntity<Boolean> activateComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PatchMapping(value = "{commentId}/deactivate")
    public ResponseEntity<Boolean> deactivateComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }
}
