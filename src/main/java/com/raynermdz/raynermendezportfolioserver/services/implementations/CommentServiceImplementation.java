package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoConverter;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.CommentRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.CommentResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Comment;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.repositories.CommentRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor
@Service
public class CommentServiceImplementation implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final DtoConverter dtoConverter;

    @Override
    public Optional<CommentResponseDto> saveComment(CommentRequestDto commentRequestDto, UUID postId) {

        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            Comment comment = (Comment) this.dtoConverter.convertToEntity(commentRequestDto, new Comment());
            comment.setIsActive(false);
            comment.setCreatedDate(new Date());
            comment.setPost(post.get());

            Comment savedComment = this.commentRepository.save(comment);
            CommentResponseDto response = (CommentResponseDto) this.dtoConverter.convertToDto(savedComment, new CommentResponseDto());
            return Optional.of(response);
        }
        throw new EntityNotFoundException(Post.class, "id", postId.toString());
    }

    @Override
    public Optional<List<CommentResponseDto>> getAllCommentsByPostId(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            List<CommentResponseDto> responseDtos = new ArrayList<>();
            post.get().getComments()
                    .forEach(comment -> responseDtos.add((CommentResponseDto) this.dtoConverter.convertToDto(comment, new CommentResponseDto())));

            return Optional.of(responseDtos);
        }
        return Optional.empty();
    }

    @Override
    public Optional<CommentResponseDto> getCommentById(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            return Optional.of((CommentResponseDto) this.dtoConverter.convertToDto(comment, new CommentResponseDto()));
        }
        return Optional.empty();
    }

    @Override
    public Optional<CommentResponseDto> updateComment(CommentRequestDto commentRequestDto, UUID postId) {
        Comment comment = (Comment) this.dtoConverter.convertToEntity(commentRequestDto, new Comment());
        Optional<Comment> foundComment = this.commentRepository.findById(comment.getId());

        if (foundComment.isPresent()) {
            return Optional.of((CommentResponseDto) this.dtoConverter.convertToDto(this.commentRepository.save(foundComment.get()), new CommentResponseDto()));
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
            comment.get().setIsActive(true);
            this.commentRepository.save(comment.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean deactivateComment(UUID commentId) {
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if (comment.isPresent()) {
            comment.get().setIsActive(false);
            this.commentRepository.save(comment.get());
            return true;
        }
        return false;
    }
}
