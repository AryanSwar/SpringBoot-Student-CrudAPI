package com.jsp.student_crud.controller;

import com.jsp.student_crud.model.Student;
import com.jsp.student_crud.service.StudentService;
import com.jsp.student_crud.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    //tight coupling - specialization

//    StudentService service = new StudentServiceImpl();

    @Autowired
    StudentService service;

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return service.saveStudent(student);

    }
}
