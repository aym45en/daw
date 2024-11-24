package com.example.tp4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tp4.Service.StudentService;
import com.example.tp4.model.Student;

import org.springframework.ui.Model;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestParam String name, @RequestParam String email,
            @RequestParam int age) {
        Student student = new Student(name, email, age);
        studentService.addStudent(student);
        return "redirect:/students";
    }

}
