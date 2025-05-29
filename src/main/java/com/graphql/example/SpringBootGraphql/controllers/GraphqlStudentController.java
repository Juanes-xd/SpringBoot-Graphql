package com.graphql.example.SpringBootGraphql.controllers;

import com.graphql.example.SpringBootGraphql.entities.Course;
import com.graphql.example.SpringBootGraphql.entities.Student;
import com.graphql.example.SpringBootGraphql.graphql.InputStudent;
import com.graphql.example.SpringBootGraphql.services.ICourseService;
import com.graphql.example.SpringBootGraphql.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphqlStudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ICourseService courseService;

    //Los nombres del controlador y arguemnto deben conincidir con los de la Query de graphql
    @QueryMapping(name = "findStudentById")
    public Student findById(@Argument(name = "studentId") String id){
        Long studentId = Long.parseLong(id);
        return studentService.findById(studentId);
    }

    @QueryMapping(name = "findAllStudents")
    public List<Student> findAll(){

        return studentService.findAll();
    }
    @MutationMapping
    public Student createStudent(@Argument InputStudent inputStudent){

        Course course = courseService.findById(Long.parseLong(inputStudent.getCourseId()));

        Student student = new Student();
        student.setName(inputStudent.getName());
        student.setLastName(inputStudent.getLastName());
        student.setAge(inputStudent.getAge());
        student.setCourse(course);
        studentService.createStudent(student);
        return student;
    }
@MutationMapping(name = "deleteStudentById")
    public String deleteStudentById(@Argument(name = "studentId") String id) {
        Long studentId = Long.parseLong(id);
        studentService.deleteById(studentId);
        return "Student with ID: " + studentId + " deleted successfully.";
    }
}
