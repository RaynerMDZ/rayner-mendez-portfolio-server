package com.raynermdz.raynermendezportfolioserver.dtos;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoEntity;
import com.raynermdz.raynermendezportfolioserver.models.Picture;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto extends BaseEntityDto implements DtoEntity {

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
    private Picture picture;

}
