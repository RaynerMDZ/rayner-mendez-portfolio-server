package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class PictureResponseDto extends BaseDto {
    private String pictureName;
    private String pictureUrl;
    private Date createdDate;
    private Date modifiedDate;
    private MinimalPostResponseDto post;
}
