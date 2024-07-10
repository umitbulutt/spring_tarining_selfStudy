package com.company.controller;

import com.company.dto.CourseDTO;
import com.company.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses() {
//        throw new RuntimeException("My Exception");
        List<CourseDTO> list = courseService.getCourses();
        return list;
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO course) {
        courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable("id") Long courseId) {
        courseService.deleteCourseById(courseId);
    }

    @DeleteMapping
    public void deleteCourses() {
        courseService.deleteCourses();
    }

}
