package com.raynermdz.raynermendezportfolioserver.repositories;

import com.raynermdz.raynermendezportfolioserver.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
}
