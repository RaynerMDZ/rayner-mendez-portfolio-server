package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class ServiceResponseDto extends BaseDto {
    private String service;
    private String description;
    private Date createdDate;
    private Date modifiedDate;
    private MinimalUserResponseDto user;
}
