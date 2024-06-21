package com.example.SpringBootSecurityLearn.services;

import com.example.SpringBootSecurityLearn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {}

    public List<User> getAllUsers() {
        return list;
    }

    public User getUser(String username) {
        return list.stream().filter(user -> user.getUserId().equals(username)).findAny().orElse(null);
    }
    public User addUser(User user) {
        list.add(user);
        return user;
    }
}
