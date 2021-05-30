package com.raynermdz.raynermendezportfolioserver.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.TemporalType.DATE;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(
        name = "user",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "user_id", columnList = "id")
)
public class User extends BaseEntity {

    @Column(name = "first_name", unique = false, nullable = true)
    private String firstName;

    @Column(name = "middle_name", unique = false, nullable = true)
    private String middleName;

    @Column(name = "last_name", unique = false, nullable = true)
    private String lastName;

    @Column(name = "email", unique = false, nullable = true)
    private String email;

    @Column(name = "phone_number", unique = false, nullable = true)
    private String phoneNumber;

    @Column(name = "header", unique = false, nullable = true)
    private String header;

    @Column(name = "about_me", unique = false, nullable = true)
    private String aboutMe;

    @Column(name = "github", unique = false, nullable = true)
    private String github;

    @Column(name = "linkedin", unique = false, nullable = true)
    private String linkedIn;

    @Column(name = "twitter", unique = false, nullable = true)
    private String twitter;

    @Column(name = "youtube", unique = false, nullable = true)
    private String youtube;

    @Temporal(DATE)
    @DateTimeFormat(pattern = "MMM-dd-YYYY")
    @Column(name = "created_date", unique = false, nullable = true)
    private Date createdDate;

    @Temporal(DATE)
    @DateTimeFormat (pattern = "MMM-dd-YYYY")
    @Column(name = "modified_date", unique = false, nullable = true)
    private Date modifiedDate;

    @OneToOne
    private Picture picture;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "services", unique = false, nullable = true)
    private List<Service> services;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "skills", unique = false, nullable = true)
    private List<Skill> skills;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "posts", unique = false, nullable = true)
    private List<Post> posts;

}
