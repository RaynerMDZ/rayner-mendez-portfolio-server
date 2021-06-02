package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class PictureDto extends BaseDto {
    private String pictureName;
    private String pictureUrl;
    private Boolean isHidden;
    private Date createdDate;
    private Date modifiedDate;
    private MinimalPostDto post;
}
