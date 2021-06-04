package com.raynermdz.raynermendezportfolioserver.services;

import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.SkillRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.SkillResponseDto;
import com.raynermdz.raynermendezportfolioserver.models.Skill;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SkillService {
    Optional<SkillResponseDto> saveSkill(SkillRequestDto Skill, UUID userId);
    Optional<List<SkillResponseDto>> getAllSkillsByUserId(UUID userId);
    Optional<SkillResponseDto> getSkillById(UUID skillId);
    Optional<SkillResponseDto> updateSkill(SkillRequestDto skill, UUID userId);
    Boolean deleteSkill(UUID skillId);
    Boolean activateSkill(UUID skillId);
    Boolean deactivateSkill(UUID skillId);
}
