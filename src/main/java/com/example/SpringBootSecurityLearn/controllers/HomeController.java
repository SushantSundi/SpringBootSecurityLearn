package com.example.SpringBootSecurityLearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/normal")
    public String getNormal() {
        return "Hi you hit Normal Api";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Hi you hit Admin Api";
    }

    @GetMapping("/public")
    public String getPublic() {
        return "Hi you hit Public Api";
    }
}
