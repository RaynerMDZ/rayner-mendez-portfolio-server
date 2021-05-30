package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
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
    public Optional<List<Picture>> getAllPicturesByPostId(UUID postId) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> getPictureById(UUID pictureId) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> savePostPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> updatePostPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> savePostMainPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> updatePostMainPicture(UUID postId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> saveUserPicture(UUID userId, MultipartFile picture) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> updateUserPicture(UUID userId, MultipartFile picture) {
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
        return null;
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
