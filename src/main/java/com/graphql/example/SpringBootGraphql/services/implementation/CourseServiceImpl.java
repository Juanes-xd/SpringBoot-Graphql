package com.graphql.example.SpringBootGraphql.services.implementation;

import com.graphql.example.SpringBootGraphql.entities.Course;
import com.graphql.example.SpringBootGraphql.services.ICourseService;

import java.util.List;

public class CourseServiceImpl implements ICourseService {
    @Override
    public Course findById(Long id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return List.of();
    }

    @Override
    public void createCourse(Course Course) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
