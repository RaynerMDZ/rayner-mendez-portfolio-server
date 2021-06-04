package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PictureResponseDto;
import com.raynermdz.raynermendezportfolioserver.models.Picture;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.repositories.PictureRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.PictureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class PictureServiceImplementation implements PictureService {

    private final PictureRepository pictureRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Override
    public Optional<List<PictureResponseDto>> getAllPicturesByPostId(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);

//        if (post.isPresent()) {
//            return Optional.of(post.get().getPictures());
//        }
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> getPostPictureById(UUID pictureId) {
        Optional<Picture> picture = this.pictureRepository.findById(pictureId);

//        if (picture.isPresent()) {
//            return picture;
//        }

        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> savePostPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> updatePostPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> savePostMainPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> updatePostMainPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> saveUserPicture(UUID userId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<PictureResponseDto> updateUserPicture(UUID userId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Boolean deletePostPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean activatePostPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deactivatePostPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deletePostMainPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean activatePostMainPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deactivatePostMainPicture(UUID postId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deleteUserPicture(UUID userId, UUID pictureId) {
        if (this.userRepository.findById(userId).isPresent()) {
            Optional<Picture> picture = this.pictureRepository.findById(pictureId);
            if (picture.isPresent()) {
                this.pictureRepository.delete(picture.get());
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean activateUserPicture(UUID userId, UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deactivateUSerPicture(UUID userId, UUID pictureId) {
        return null;
    }
}
