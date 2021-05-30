package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.Comment;
import com.raynermdz.raynermendezportfolioserver.models.Skill;
import com.raynermdz.raynermendezportfolioserver.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/comment/")
@CrossOrigin(value = "${cross.origin.url}")
public class CommentController {

    private final CommentService commentService;

    @PostMapping(value = "save")
    public ResponseEntity<Comment> saveComment(Skill Skill) {
        return null;
    }

    @GetMapping(value = "{postId}/post-comments")
    public ResponseEntity<List<Comment>> getAllCommentsByPostId(@PathVariable(value = "postId") UUID postId) {
        return null;
    }

    @GetMapping(value = "{commentId}")
    public ResponseEntity<Comment> getCommentById(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PatchMapping(value = "update")
    public ResponseEntity<Comment> updateComment(Comment comment) {
        return null;
    }

    @PutMapping(value = "{commentId}/delete")
    public ResponseEntity<Boolean> deleteComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PutMapping(value = "{commentId}/activate")
    public ResponseEntity<Boolean> activateComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }

    @PutMapping(value = "{commentId}/deactivate")
    public ResponseEntity<Boolean> deactivateComment(@PathVariable(value = "commentId") UUID commentId) {
        return null;
    }
}
