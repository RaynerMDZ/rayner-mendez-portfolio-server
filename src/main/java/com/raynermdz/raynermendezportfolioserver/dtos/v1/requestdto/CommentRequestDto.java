package com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class CommentRequestDto extends BaseDto {
    private String name;
    private String body;
}
