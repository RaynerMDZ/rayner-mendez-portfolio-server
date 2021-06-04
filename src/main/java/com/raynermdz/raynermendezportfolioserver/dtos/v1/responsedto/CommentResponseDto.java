package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Setter
@Getter

public class CommentResponseDto extends BaseDto {
    private String name;
    private String body;
    private Date createdDate;
    private MinimalPostResponseDto post;
}
