package com.raynermdz.raynermendezportfolioserver.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(
        name = "user",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "user_id", columnList = "id")
)
public class User extends BaseEntity {

    @Column(name = "about_me", unique = false, nullable = true)
    private String aboutMe;

//    @Column(name = "picture", unique = false, nullable = true)
    @OneToOne
    private Picture picture;

    @Column(name = "github", unique = false, nullable = true)
    private String github;

    @Column(name = "linkedin", unique = false, nullable = true)
    private String linkedIn;

    @Column(name = "twitter", unique = false, nullable = true)
    private String twitter;

    @Column(name = "youtube", unique = false, nullable = true)
    private String youtube;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Column(name = "services", unique = false, nullable = true)
    private List<Service> services;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Column(name = "skills", unique = false, nullable = true)
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Column(name = "posts", unique = false, nullable = true)
    private List<Post> posts;

}
