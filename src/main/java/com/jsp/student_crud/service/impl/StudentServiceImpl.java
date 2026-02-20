package com.jsp.student_crud.service.impl;

import com.jsp.student_crud.model.Student;
import com.jsp.student_crud.repository.StudentRepository;
import com.jsp.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }
}
