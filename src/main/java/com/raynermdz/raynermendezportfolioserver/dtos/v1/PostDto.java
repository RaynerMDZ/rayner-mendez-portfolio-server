package com.raynermdz.raynermendezportfolioserver.dtos.v1;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class PostDto extends BaseDto {

    private String Title;
    private String description;
    private String gitHub;
    private String link;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean isHidden;
    private PictureDto postPictureDto;
    private MinimalUserDto user;

//    @OneToMany(
//            mappedBy = "post",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Picture> pictures = new ArrayList<>();
//
//    @OneToMany(
//            mappedBy = "post",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Comment> comments = new ArrayList<>();
}