package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Post;
import com.raynermdz.raynermendezportfolioserver.models.User;
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
        return Optional.of(this.postRepository.save(post));
    }

    @Override
    public Optional<List<Post>> getAllPostsByUserId(UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);

        if (user.isPresent()) {
            return Optional.of(user.get().getPosts());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Post> getPostById(UUID postId) {
        Optional<Post> post = this.postRepository.findById(postId);
        if (post.isPresent()) {
            return this.postRepository.findById(postId);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Post> updatePost(Post post) {
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
