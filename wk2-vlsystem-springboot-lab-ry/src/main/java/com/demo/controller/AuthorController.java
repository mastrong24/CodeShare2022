package com.demo.controller;

import com.demo.repository.AuthorRepository;
import com.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;
    @GetMapping("/author")
    public List getAuthor(){
        System.out.println("GET ALL Author FROM REPOSITORY");
        List authorList = null;
        authorList = authorRepository.findAll();
        return  authorList;
    }

}
