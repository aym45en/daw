
package com.example.tp7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tp7.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
