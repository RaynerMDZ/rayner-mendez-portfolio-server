package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
public class PostResponseDto extends BaseDto {
    private String Title;
    private String description;
    private String gitHub;
    private String link;
    private Date createdDate;
    private Date modifiedDate;
    private PictureResponseDto postPicture;
    private List<PictureResponseDto> pictures;
    private List<CommentResponseDto> comments;
    private MinimalUserResponseDto user;
}
