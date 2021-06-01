package com.raynermdz.raynermendezportfolioserver.dtos;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoEntity;
import com.raynermdz.raynermendezportfolioserver.models.User;
import lombok.Data;

import java.util.Date;


@Data
public class SkillDto extends BaseEntityDto implements DtoEntity {

    private String skill;
    private String description;
    private Boolean isHidden;
    private Date createdDate;
    private Date modifiedDate;
    private User user;
}
