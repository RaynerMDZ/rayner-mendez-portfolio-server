package com.raynermdz.raynermendezportfolioserver.repositories;

import com.raynermdz.raynermendezportfolioserver.models.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CommentRepository extends CrudRepository<Comment, UUID> {
}
