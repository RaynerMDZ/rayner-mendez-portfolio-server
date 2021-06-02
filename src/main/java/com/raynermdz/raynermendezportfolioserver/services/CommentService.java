package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.CommentRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.CommentResponseDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommentService {
    Optional<CommentResponseDto> saveComment(CommentRequestDto comment);
    Optional<List<CommentResponseDto>> getAllCommentsByPostId(UUID postId);
    Optional<CommentResponseDto> getCommentById(UUID commentId);
    Optional<CommentResponseDto> updateComment(CommentRequestDto comment);
    Boolean deleteComment(UUID commentId);
    Boolean activateComment(UUID commentId);
    Boolean deactivateComment(UUID commentId);
}
