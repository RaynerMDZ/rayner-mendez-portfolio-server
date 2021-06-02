package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class MinimalUserDto extends BaseDto {
    private String firstName;
    private String middleName;
    private String lastName;
}
