package com.graphql.example.SpringBootGraphql.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Course.class)
    private Course course;
}
