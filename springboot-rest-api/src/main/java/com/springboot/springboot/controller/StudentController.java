package com.springboot.springboot.controller;

import com.springboot.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        return new Student(1, "Sounak", "Saha");
    }
}
