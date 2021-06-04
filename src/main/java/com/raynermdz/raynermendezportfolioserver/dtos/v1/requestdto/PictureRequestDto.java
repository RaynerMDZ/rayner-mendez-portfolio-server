package com.raynermdz.raynermendezportfolioserver.dtos.v1.requestdto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

@Data
public class PictureRequestDto extends BaseDto {
    private String pictureName;
    private String pictureUrl;
}
