package com.raynermdz.raynermendezportfolioserver.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Data
@Entity
@Table(
        name = "comment",
        uniqueConstraints = {@UniqueConstraint(columnNames = "id")},
        indexes = @Index(name = "comment_id", columnList = "id")
)
public class Comment extends BaseEntity {

    @Size(min=2, max=15, message="Name must be between 2 and 15 characters long.")
    @Column(name = "name", unique = false, nullable = true)
    private String name;

    @Size(min=5, max=500, message="Body must be between 5 and 500 characters long.")
    @Column(name = "body", unique = false, nullable = true, length = 500)
    private String body;

    @Temporal(DATE)
    @DateTimeFormat(pattern = "MMM-dd-YYYY")
    @Column(name = "created_date", unique = false, nullable = true)
    private Date createdDate;

    @Column(name = "is_hidden", unique = false, nullable = true)
    private Boolean isHidden;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
}
