package com.springboot.springboot.controller;

import com.springboot.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Sounak", "Saha");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ankan", "Saha"));
        students.add(new Student(2, "Sounak", "Saha"));
        students.add(new Student(3, "Jai", "Gupta"));
        return students;
    }
}
