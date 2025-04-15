package com.graphql.example.SpringBootGraphql.services;

import com.graphql.example.SpringBootGraphql.entities.Course;

import java.util.List;

public interface ICourseService {
    Course findById(Long id);
    List<Course> findAll();
    void createCourse(Course Course);
    void deleteById(Long id);
}
