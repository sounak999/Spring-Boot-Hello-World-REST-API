package com.springboot.springboot.controller;

import com.springboot.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // http://localhost:8080

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

    // Path Variable
    @GetMapping("/student/{id}/{first-name}/{last-name}")
    // {id} -> URI template variable
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

    // Request Parameter
    // http://localhost:8080/student/query?id=999&firstName=Ben&lastName=Stokes
    @GetMapping("/student/query")
    public Student studentRequestParameter(@RequestParam int id,
                                           @RequestParam String firstName,
                                           @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }
}
