package com.graphql.example.SpringBootGraphql.services.implementation;

import com.graphql.example.SpringBootGraphql.entities.Student;
import com.graphql.example.SpringBootGraphql.persistence.IStudentDAO;
import com.graphql.example.SpringBootGraphql.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO studentDAO;

    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) studentDAO.findAll();
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        studentDAO.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        studentDAO.deleteById(id);
    }
}
