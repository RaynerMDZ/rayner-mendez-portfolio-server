package com.raynermdz.raynermendezportfolioserver.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Data
@Entity
@Table(
        name = "skill",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "skill_id", columnList = "id")
)
public class Skill extends BaseEntity {

    @Column(name = "skill")
    private String skill;

    @Column(name = "description")
    private String description;

    @Column(name = "is_hidden", unique = false, nullable = true)
    private Boolean isHidden;

    @Temporal(DATE)
    @DateTimeFormat(pattern = "MMM-dd-YYYY")
    @Column(name = "created_date", unique = false, nullable = true)
    private Date createdDate;

    @Temporal(DATE)
    @DateTimeFormat (pattern = "MMM-dd-YYYY")
    @Column(name = "modified_date", unique = false, nullable = true)
    private Date modifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
