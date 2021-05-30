package com.raynermdz.raynermendezportfolioserver.repositories;

import com.raynermdz.raynermendezportfolioserver.models.Picture;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PictureRepository extends CrudRepository<Picture, UUID> {
}
