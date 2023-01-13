package com.example.thepathproject2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @GetMapping(value = "/student/{studentId}")
    public @ResponseBody Student getTestData(@PathVariable Integer studentId) {
        Student student = new Student();
        student.setName("Peter");
        student.setId(studentId);

        return student;
    }
}

class Student {
//    public Student(String name, int id) {
//        Name = name;
//        Id = id;
//    }

    private String Name;
    private int Id;

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }
}