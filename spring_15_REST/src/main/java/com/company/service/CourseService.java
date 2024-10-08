package com.company.service;

import com.company.dto.CourseDTO;
import com.company.entity.Course;

import java.util.List;

public interface CourseService {

    CourseDTO createCourse(CourseDTO courseDTO);
    CourseDTO getCourseById(long courseId);

    List<CourseDTO> getCoursesByCategory(String category);
    List<CourseDTO> getCourses();

    void updateCourse(Long courseId, CourseDTO courseDTO);

    void deleteCourseById(long courseId);
    void deleteCourses();

    List<Course> getSummerCourse(String category);

}
