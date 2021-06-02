package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class CommentDto extends BaseDto {
    private String name;
    private String body;
    private Date createdDate;
    private Boolean isHidden;
    private MinimalPostDto post;
}
