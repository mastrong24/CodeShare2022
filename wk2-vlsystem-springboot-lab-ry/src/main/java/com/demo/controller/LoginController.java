package com.demo.controller;

import com.demo.repository.CourseRepository;
import com.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;
    @GetMapping("/login")
    public List getLogin(){
        System.out.println("GET ALL Login FROM REPOSITORY");
        List loginList = null;
        loginList = loginRepository.findAll();
        return  loginList;
    }
}
