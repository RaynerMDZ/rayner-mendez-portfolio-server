package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class ServiceDto extends BaseDto {
    private String service;
    private String description;
    private Boolean isHidden;
    private Date createdDate;
    private Date modifiedDate;
    private MinimalUserDto user;
}
