package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    Optional<Post> savePost(Post post);
    Optional<List<Post>> getAllPostsByUserId(UUID userId);
    Optional<Post> getPostById(UUID postId);
    Optional<Post> updatePost(Post post);
    Boolean deletePost(UUID postId);
    Boolean activatePost(UUID postId);
    Boolean deactivatePost(UUID postId);
}
