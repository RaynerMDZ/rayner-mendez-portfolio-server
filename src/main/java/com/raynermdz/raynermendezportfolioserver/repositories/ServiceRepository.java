package com.raynermdz.raynermendezportfolioserver.repositories;

import com.raynermdz.raynermendezportfolioserver.models.Service;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ServiceRepository extends CrudRepository<Service, UUID> {
}
