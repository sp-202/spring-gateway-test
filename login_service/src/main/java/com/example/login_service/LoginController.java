package com.example.login_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/service/login/user")
    public String getLogin(){
        return "I am from login controller";
    }
}
