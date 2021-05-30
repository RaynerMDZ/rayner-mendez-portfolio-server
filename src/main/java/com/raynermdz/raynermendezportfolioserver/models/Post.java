package com.raynermdz.raynermendezportfolioserver.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.TemporalType.DATE;

@Data
@Entity
@Table(
        name = "post",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "post_id", columnList = "id")
)
public class Post extends BaseEntity {

    @Column(name = "title", unique = false, nullable = true)
    private String Title;

    @Column(name = "description", unique = false, nullable = true, length = 1000)
    private String description;

    @Column(name = "github", unique = false, nullable = true)
    private String gitHub;

    @Column(name = "link", unique = false, nullable = true)
    private String link;

    @Temporal(DATE)
    @DateTimeFormat(pattern = "MMM-dd-YYYY")
    @Column(name = "created_date", unique = false, nullable = true)
    private Date createdDate;

    @Temporal(DATE)
    @DateTimeFormat (pattern = "MMM-dd-YYYY")
    @Column(name = "modified_date", unique = false, nullable = true)
    private Date modifiedDate;

    @Column(name = "is_hidden", unique = false, nullable = true)
    private Boolean isHidden;

    @Column(name = "post_picture", unique = false, nullable = true)
    private Picture postPicture;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Picture> pictures = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    @ManyToOne
    private User user;
}
