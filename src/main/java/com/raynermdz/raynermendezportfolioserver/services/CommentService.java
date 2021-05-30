package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Comment;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllCommentsByPostId(UUID postId);
    Optional<Comment> getCommentById(UUID commentId);
    Optional<Comment> updateComment(Comment comment);
    Boolean deleteComment(UUID commentId);
    Boolean activateComment(UUID commentId);
    Boolean deactivateComment(UUID commentId);
}
