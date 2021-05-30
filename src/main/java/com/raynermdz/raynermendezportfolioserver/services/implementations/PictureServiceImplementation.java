package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.repositories.PictureRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.services.PictureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class PictureServiceImplementation implements PictureService {

    private final PictureRepository pictureRepository;
    private final PostRepository postRepository;

    @Override
    public Picture savePicture(Picture picture) {
        return null;
    }

    @Override
    public List<Picture> getAllPicturesByPostId(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);
        if (post.isPresent()) {
            return post.get().getPictures();
        }
        return new ArrayList<>();
    }

    @Override
    public Optional<Picture> getPictureById(UUID pictureId) {
        return Optional.empty();
    }

    @Override
    public Optional<Picture> updatePicture(Picture picture) {
        return Optional.empty();
    }

    @Override
    public Boolean deletePicture(UUID pictureId) {
        return null;
    }

    @Override
    public Boolean activatePicture(UUID pictureId) {
        return null;
    }

    @Override
    public Boolean deactivatePicture(UUID pictureId) {
        return null;
    }
}
