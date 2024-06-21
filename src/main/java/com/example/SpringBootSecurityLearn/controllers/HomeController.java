package com.example.SpringBootSecurityLearn.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @PreAuthorize("hasRole('NORMAL')")
    @GetMapping("/normal")
    public String getNormal() {
        return "Hi you hit Normal Api";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String getAdmin() {
        return "Hi you hit Admin Api";
    }

    @GetMapping("/public")
    public String getPublic() {
        return "Hi you hit Public Api";
    }
}
