package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class MinimalUserResponseDto extends BaseDto {
    private String firstName;
    private String middleName;
    private String lastName;
}
