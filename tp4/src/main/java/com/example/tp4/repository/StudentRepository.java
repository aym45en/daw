package com.example.tp4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.tp4.model.Student;

@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public StudentRepository() {
    }

    public List<Student> findAll() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
