package com.example.tp4.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tp4.model.Student;
import com.example.tp4.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
}
