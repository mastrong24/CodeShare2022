package com.demo.controller;

import com.demo.repository.AuthorRepository;
import com.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;
    @GetMapping("/course")
    public List getCourse(){
        System.out.println("GET ALL Course FROM REPOSITORY");
        List courseList = null;
        courseList = courseRepository.findAll();
        return  courseList;
    }

}
