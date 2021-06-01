package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Comment;
import com.raynermdz.raynermendezportfolioserver.models.Post;
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
    public Optional<Comment> saveComment(Comment comment) {
        return Optional.of(this.commentRepository.save(comment));
    }

    @Override
    public Optional<List<Comment>> getAllCommentsByPostId(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            return Optional.of(post.get().getComments());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Comment> getCommentById(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            return comment;
        }
        return Optional.empty();
    }

    @Override
    public Optional<Comment> updateComment(Comment comment) {
        Optional<Comment> foundComment = this.commentRepository.findById(comment.getId());

        if (foundComment.isPresent()) {
            return Optional.of(this.commentRepository.save(comment));
        }
        return Optional.empty();
    }

    @Override
    public Boolean deleteComment(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            this.commentRepository.delete(comment.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean activateComment(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            comment.get().setIsHidden(true);
            this.commentRepository.save(comment.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean deactivateComment(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            comment.get().setIsHidden(false);
            this.commentRepository.save(comment.get());
            return true;
        }
        return false;
    }
}
