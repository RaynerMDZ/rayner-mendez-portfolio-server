package com.raynermdz.raynermendezportfolioserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Data
@Entity
@Table(
        name = "picture",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "picture_id", columnList = "id")
)
public class Picture extends BaseEntity {

    @Column(name = "picture_name", unique = false, nullable = true)
    private String pictureName;

    @Lob
    @Column(name = "picture_url", unique = false, nullable = true)
    private String pictureUrl;

    @Column(name = "is_active", unique = false, nullable = true)
    private Boolean isActive;

    @Temporal(DATE)
    @DateTimeFormat(pattern = "MMM-dd-YYYY")
    @Column(name = "created_date", unique = false, nullable = true)
    private Date createdDate;

    @Temporal(DATE)
    @DateTimeFormat (pattern = "MMM-dd-YYYY")
    @Column(name = "modified_date", unique = false, nullable = true)
    private Date modifiedDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Post post;

//    @OneToOne
//    private Post postPicture;
//
//    @OneToOne
//    private User user;
}
