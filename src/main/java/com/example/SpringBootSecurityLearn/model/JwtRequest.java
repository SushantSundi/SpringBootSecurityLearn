package com.example.SpringBootSecurityLearn.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JwtRequest {

    private String email;
    private String password;

    public JwtRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
