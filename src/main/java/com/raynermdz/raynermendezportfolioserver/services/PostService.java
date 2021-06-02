package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.PostRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.PostResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    Optional<PostResponseDto> savePost(PostRequestDto post);
    Optional<List<PostResponseDto>> getAllPostsByUserId(UUID userId);
    Optional<PostResponseDto> getPostById(UUID postId) throws EntityNotFoundException;
    Optional<PostResponseDto> updatePost(PostRequestDto post);
    Boolean deletePost(UUID postId);
    Boolean activatePost(UUID postId);
    Boolean deactivatePost(UUID postId);
}
