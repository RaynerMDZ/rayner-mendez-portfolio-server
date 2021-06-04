package com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class ServiceRequestDto extends BaseDto {
    private String service;
    private String description;
}
