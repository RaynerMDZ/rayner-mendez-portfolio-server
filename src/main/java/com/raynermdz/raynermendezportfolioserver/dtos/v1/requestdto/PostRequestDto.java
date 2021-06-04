package com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class PostRequestDto extends BaseDto {
    private String Title;
    private String description;
    private String gitHub;
    private String link;
}
