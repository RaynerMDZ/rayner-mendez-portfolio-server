package com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class SkillRequestDto extends BaseDto {
    private String skill;
    private String description;
}
