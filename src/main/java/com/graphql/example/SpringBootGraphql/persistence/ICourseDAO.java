package com.graphql.example.SpringBootGraphql.persistence;

import com.graphql.example.SpringBootGraphql.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDAO extends CrudRepository<Course, Long> {
}
