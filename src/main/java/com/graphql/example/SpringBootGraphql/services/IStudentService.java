package com.graphql.example.SpringBootGraphql.services;

import com.graphql.example.SpringBootGraphql.entities.Student;

import java.util.List;

public interface IStudentService {
    Student findById(Long id);
    List<Student> findAll();
    void createStudent(Student student);
    void deleteById(Long id);
}
