package com.raynermdz.raynermendezportfolioserver.repositories;

import com.raynermdz.raynermendezportfolioserver.models.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SkillRepository extends CrudRepository<Skill, UUID> {
}
