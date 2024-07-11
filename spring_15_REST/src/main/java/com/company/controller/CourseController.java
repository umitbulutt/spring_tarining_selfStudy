package com.company.controller;


import com.company.dto.CourseDTO;
import com.company.entity.Course;
import com.company.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){

        //return all courses
        return courseService.getCourses();

    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") long courseId){
        return courseService.getCourseById(courseId);
    }

    @GetMapping("{category}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("category") String category){
        return courseService.getCoursesByCategory(category);
    }


}
