package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.models.Skill;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SkillService {
    Optional<Skill> saveSkill(Skill Skill);
    Optional<List<Skill>> getAllSkillsByUserId(UUID userId);
    Optional<Skill> getSkillById(UUID skillId);
    Optional<Skill> updateSkill(Skill skill);
    Boolean deleteSkill(UUID skillId);
    Boolean activateSkill(UUID skillId);
    Boolean deactivateSkill(UUID skillId);
}
