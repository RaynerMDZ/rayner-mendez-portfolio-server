package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.repositories.PostRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class PostServiceImplementation implements PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Override
    public Optional<Post> savePost(Post post) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Post>> getAllPostsByUserId(UUID userId) {
        return Optional.empty();
    }

    @Override
    public Optional<Post> getPostById(UUID postId) {
        return Optional.empty();
    }

    @Override
    public Optional<Post> updatePost(Post post) {
        return Optional.empty();
    }

    @Override
    public Boolean deletePost(UUID postId) {
        return null;
    }

    @Override
    public Boolean activatePost(UUID postId) {
        return null;
    }

    @Override
    public Boolean deactivatePost(UUID postId) {
        return null;
    }
}
