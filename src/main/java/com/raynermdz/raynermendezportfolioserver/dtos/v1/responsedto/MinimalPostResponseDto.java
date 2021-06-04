package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class MinimalPostResponseDto extends BaseDto {
    private String Title;
    private String link;
}
