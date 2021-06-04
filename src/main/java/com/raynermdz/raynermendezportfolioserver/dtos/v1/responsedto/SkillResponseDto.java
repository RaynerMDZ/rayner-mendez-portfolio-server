package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class SkillResponseDto extends BaseDto {
    private String skill;
    private String description;
    private Boolean isHidden;
    private Date createdDate;
    private Date modifiedDate;
    private MinimalUserResponseDto user;
}
