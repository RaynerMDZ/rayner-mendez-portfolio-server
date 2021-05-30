package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Comment;
import com.raynermdz.raynermendezportfolioserver.repositories.CommentRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class CommentServiceImplementation implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Override
    public Comment saveComment(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> getAllCommentsByPostId(UUID postId) {
        return null;
    }

    @Override
    public Optional<Comment> getCommentById(UUID commentId) {
        return Optional.empty();
    }

    @Override
    public Optional<Comment> updateComment(Comment comment) {
        return Optional.empty();
    }

    @Override
    public Boolean deleteComment(UUID commentId) {
        return null;
    }

    @Override
    public Boolean activateComment(UUID commentId) {
        return null;
    }

    @Override
    public Boolean deactivateComment(UUID commentId) {
        return null;
    }
}
