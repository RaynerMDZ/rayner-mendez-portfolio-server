package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class MinimalPostDto extends BaseDto {
    private String Title;
    private String link;
}
