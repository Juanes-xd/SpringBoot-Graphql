package com.graphql.example.SpringBootGraphql.controllers;

import com.graphql.example.SpringBootGraphql.entities.Student;
import com.graphql.example.SpringBootGraphql.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlStudentController {

    @Autowired
    private IStudentService studentService;

    //Los nombres del controlador y arguemnto deben conincidir con los de la Query de graphql
    @QueryMapping(name = "findStudenById")
    public Student findById(@Argument(name = "studentId") String id){
        Long studentId = Long.parseLong(id);
        return studentService.findById(studentId);
    }
}
