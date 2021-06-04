package com.raynermdz.raynermendezportfolioserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.TemporalType.DATE;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
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

//    @Column(name = "post_picture", unique = false, nullable = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Picture postPicture;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Picture> pictures = new ArrayList<>();

    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Comment> comments = new ArrayList<>();
}
