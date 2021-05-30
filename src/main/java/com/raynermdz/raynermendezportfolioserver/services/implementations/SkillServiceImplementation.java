package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.models.Skill;
import com.raynermdz.raynermendezportfolioserver.repositories.SkillRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SkillServiceImplementation implements SkillService {

    private final SkillRepository skillRepository;
    private final UserRepository userRepository;

    @Override
    public Optional<Skill> saveSkill(Skill Skill) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Skill>> getAllSkillsByUserId(UUID userId) {
        return Optional.empty();
    }

    @Override
    public Optional<Skill> getSkillById(UUID skillId) {
        return Optional.empty();
    }

    @Override
    public Optional<Skill> updateSkill(Skill skill) {
        return Optional.empty();
    }

    @Override
    public Boolean deleteSkill(UUID skillId) {
        return null;
    }

    @Override
    public Boolean activateSkill(UUID skillId) {
        return null;
    }

    @Override
    public Boolean deactivateSkill(UUID skillId) {
        return null;
    }
}
