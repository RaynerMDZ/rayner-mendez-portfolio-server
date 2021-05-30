package com.raynermdz.raynermendezportfolioserver.controllers.v1;

import com.raynermdz.raynermendezportfolioserver.models.Skill;
import com.raynermdz.raynermendezportfolioserver.services.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/skills/")
@CrossOrigin(value = "${cross.origin.url}")
public class SkillController {

    private final SkillService skillService;

    @PostMapping
    public ResponseEntity<Skill> saveSkill(Skill Skill) {
        return null;
    }

    @GetMapping(value = "{userId}/user-skills")
    public ResponseEntity<List<Skill>> getAllSkillsByUserId(@PathVariable(value = "userId") UUID userId) {
        return null;
    }

    @GetMapping(value = "{skillId}")
    public ResponseEntity<Skill> getSkillById(@PathVariable(value = "skillId") UUID skillId) {
        return null;
    }

    @PutMapping
    public ResponseEntity<Skill> updateSkill(Skill skill) {
        return null;
    }

    @DeleteMapping(value = "{skillId}")
    public ResponseEntity<Boolean> deleteSkill(@PathVariable(value = "skillId") UUID skillId) {
        return null;
    }

    @PatchMapping(value = "{skillId}/activate")
    public ResponseEntity<Boolean> activateSkill(@PathVariable(value = "skillId") UUID skillId) {
        return null;
    }

    @PatchMapping(value = "{skillId}/deactivate")
    public ResponseEntity<Boolean> deactivateSkill(@PathVariable(value = "skillId") UUID skillId) {
        return null;
    }
}
