package com.raynermdz.raynermendezportfolioserver.services.implementations;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoConverter;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto.SkillRequestDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.ServiceResponseDto;
import com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto.SkillResponseDto;
import com.raynermdz.raynermendezportfolioserver.exception.EntityNotFoundException;
import com.raynermdz.raynermendezportfolioserver.models.Skill;
import com.raynermdz.raynermendezportfolioserver.models.User;
import com.raynermdz.raynermendezportfolioserver.repositories.SkillRepository;
import com.raynermdz.raynermendezportfolioserver.repositories.UserRepository;
import com.raynermdz.raynermendezportfolioserver.services.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SkillServiceImplementation implements SkillService {

    private final SkillRepository skillRepository;
    private final UserRepository userRepository;
    private final DtoConverter dtoConverter;

    @Override
    public Optional<SkillResponseDto> saveSkill(SkillRequestDto skillRequestDto, UUID userId) {
        Optional<User> user = this.userRepository.findById(userId);

        if (user.isPresent()) {
            Skill skill = (Skill) this.dtoConverter.convertToEntity(skillRequestDto, new Skill());
            skill.setIsHidden(false);
            skill.setCreatedDate(new Date());
            skill.setUser(user.get());

            SkillResponseDto response = (SkillResponseDto) this.dtoConverter.convertToDto(this.skillRepository.save(skill), new SkillResponseDto());
            return Optional.of(response);
        }
        throw new EntityNotFoundException(User.class, "id", userId.toString());
    }

    @Override
    public Optional<List<SkillResponseDto>> getAllSkillsByUserId(UUID userId) {
        return Optional.empty();
    }

    @Override
    public Optional<SkillResponseDto> getSkillById(UUID skillId) {
        return Optional.empty();
    }

    @Override
    public Optional<SkillResponseDto> updateSkill(SkillRequestDto skill, UUID userId) {
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
