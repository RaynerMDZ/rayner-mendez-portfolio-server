package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoConverter;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.PostRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.CommentResponseDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.MinimalUserResponseDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PictureResponseDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PostResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Comment;
import com.raynermdz.raynermendezportfolioserver.models.Picture;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostServiceImplementation implements PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final DtoConverter dtoConverter;

    @Override
    public Optional<PostResponseDto> savePost(PostRequestDto postRequestDto, UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);

        if (user.isPresent()) {
            Post post = (Post) this.dtoConverter.convertToEntity(postRequestDto, new Post());
            post.setIsHidden(false);
            post.setCreatedDate(new Date());
            post.setUser(user.get());

            PostResponseDto response = (PostResponseDto) this.dtoConverter.convertToDto(this.postRepository.save(post), new PostResponseDto());
            return Optional.of(response);
        }
        throw new EntityNotFoundException(User.class, "id", userId.toString());
    }

    @Override
    public Optional<List<PostResponseDto>> getAllPostsByUserId(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);
        List<PostResponseDto> postResponseDtos = new ArrayList<>();

        if (user.isPresent()) {
            for (Post post : user.get().getPosts()) {
                postResponseDtos.add(this.getPostById(post.getId()).get());
            }

            return Optional.of(postResponseDtos);
        }
        throw new EntityNotFoundException(User.class, "id", user.toString());
    }

    @Override
    public Optional<PostResponseDto> getPostById(UUID postId) throws EntityNotFoundException {
        Optional<Post> foundPost = this.postRepository.findById(postId);

        if (foundPost.isPresent()) {
            List<Picture> pictures = foundPost.get().getPictures();
            List<Comment> comments = foundPost.get().getComments();
            List<PictureResponseDto> pictureResponseDtos;
            List<CommentResponseDto> commentResponseDtos;

            PostResponseDto postResponseDto = new PostResponseDto();
            postResponseDto.setId(foundPost.get().getId());
            postResponseDto.setTitle(foundPost.get().getTitle());
            postResponseDto.setDescription(foundPost.get().getDescription());
            postResponseDto.setGitHub(foundPost.get().getGitHub());
            postResponseDto.setLink(foundPost.get().getLink());
            postResponseDto.setCreatedDate(foundPost.get().getCreatedDate());
            postResponseDto.setModifiedDate(foundPost.get().getModifiedDate());
            postResponseDto.setPostPicture((PictureResponseDto) this.dtoConverter.convertToDto(foundPost.get().getPostPicture(), new PictureResponseDto()));
            postResponseDto.setUser((MinimalUserResponseDto) this.dtoConverter.convertToDto(foundPost.get().getUser(), new MinimalUserResponseDto()));

            pictureResponseDtos = pictures
                    .stream()
                    .map(picture -> (PictureResponseDto) this.dtoConverter.convertToDto(picture, new PictureResponseDto())).collect(Collectors.toList());

            commentResponseDtos = comments
                    .stream()
                    .map(comment -> (CommentResponseDto) this.dtoConverter.convertToDto(comment, new CommentResponseDto())).collect(Collectors.toList());

            postResponseDto.setPictures(pictureResponseDtos);
            postResponseDto.setComments(commentResponseDtos);

            return Optional.of(postResponseDto);
        }
        throw new EntityNotFoundException(Post.class, "id", postId.toString());
    }

    @Override
    public Optional<PostResponseDto> updatePost(PostRequestDto post, UUID postId) {
        return Optional.empty();
    }

    @Override
    public Boolean deletePost(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            this.postRepository.delete(post.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean activatePost(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            post.get().setIsHidden(true);
            this.postRepository.save(post.get());
            return true;
        }
        return false;
    }

    @Override
    public Boolean deactivatePost(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

        if (post.isPresent()) {
            post.get().setIsHidden(false);
            this.postRepository.save(post.get());
            return true;
        }
        return false;
    }
}
