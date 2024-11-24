package com.example.tp3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class StudentController {
    @GetMapping("/")
    public String getStudents(Model model) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("John", "dcs", 20);
        students.add(student);
        model.addAttribute("students", students);
        return "students";
    }

}
