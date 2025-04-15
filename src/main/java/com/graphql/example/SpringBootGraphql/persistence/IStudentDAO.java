package com.graphql.example.SpringBootGraphql.persistence;

import com.graphql.example.SpringBootGraphql.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO extends CrudRepository<Student, Long> {
}
