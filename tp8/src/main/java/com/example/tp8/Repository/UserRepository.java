package com.example.tp8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp8.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}