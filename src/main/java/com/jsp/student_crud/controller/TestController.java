package com.jsp.student_crud.controller;

import com.jsp.student_crud.model.Student;

public class TestController {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(123);
        s.setName("aaa");
        s.setPhone(98766789l);
        s.setEmail("akkldjjskld");
        System.out.println(s.getRoll());
        System.out.println(s.getName());
        System.out.println(s.getPhone());
        System.out.println(s.getEmail());
        Student s1 = new Student();
        Student s2 = new Student(12,"bb",123432l,"aryan@gmail.com");
        System.out.println(s2);
    }
}
