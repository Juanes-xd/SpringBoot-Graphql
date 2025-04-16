package com.graphql.example.SpringBootGraphql.graphql;

import com.graphql.example.SpringBootGraphql.entities.Course;
import lombok.Data;

@Data
public class InputStudent {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String courseId;
}
