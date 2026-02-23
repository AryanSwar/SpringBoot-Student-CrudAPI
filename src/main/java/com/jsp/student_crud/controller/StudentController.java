package com.jsp.student_crud.controller;

import com.jsp.student_crud.model.Student;
import com.jsp.student_crud.service.StudentService;
import com.jsp.student_crud.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    //tight coupling - specialization

//    StudentService service = new StudentServiceImpl();

    @Autowired
    StudentService service;

    @PostMapping("student/save")
    public Student save(@RequestBody Student student){
        return service.saveStudent(student);

    }
    @GetMapping("student/find")
    public Student findById(@RequestParam int roll)
    {
        return service.findStudent(roll);
    }

    @GetMapping("/student")
    public List<Student> findAllStudents()
    {
        return service.findAllStudent();
    }

    @PutMapping("/student/update")
    public Student updateStudent(@RequestBody Student student)
    {
        return service.updateStudent(student);
    }

    @DeleteMapping("/student/delete")
    public String delete(@RequestParam int roll)
    {
        service.deleteStudent(roll);
        return "deleted successfully";
    }
}
