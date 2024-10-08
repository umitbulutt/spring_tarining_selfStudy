package com.company.controller;


import com.company.dto.CourseDTO;
import com.company.dto.ResponseWrapper;
import com.company.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {
    private final CourseService courseService;


    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses(){

        List<CourseDTO> list = courseService.getCourses();

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version","Cydeo.V3")
                .body(new ResponseWrapper("A Spartan is born",list));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable("id") long courseId){
        return ResponseEntity.ok(new ResponseWrapper("course: " + courseId + " retrieved" ,
                courseService.getCourseById(courseId)));
    }
}
