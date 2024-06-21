package com.example.SpringBootSecurityLearn.dao;

import com.example.SpringBootSecurityLearn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping
public interface UserDao extends JpaRepository<User, String> {
    public Optional<User> findByEmail(String email);
}
