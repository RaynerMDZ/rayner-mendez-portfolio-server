package com.raynermdz.raynermendezportfolioserver.dtos.v1.responsedto;

import com.raynermdz.raynermendezportfolioserver.dtos.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class UserResponseDto extends BaseDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String header;
    private String aboutMe;
    private String github;
    private String linkedIn;
    private String twitter;
    private String youtube;
    private Date createdDate;
    private Date modifiedDate;
    private PictureResponseDto picture;
}
