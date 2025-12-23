package com.example.demJPA.controller;

import com.example.demJPA.model.Course;
import com.example.demJPA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService cs;

    @GetMapping("courses")
    public List<Course> getAllCourses() {
        return cs.getAllCourses();
    }

    @PostMapping("courses")
    public Course addCourse(@RequestBody Course course) {
        return cs.addCourse(course);
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable("courseId") int courseId) {
        return cs.getCourseByIdDirect(courseId);
    }
    
    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course) {
        cs.updateCourse(course);
        return "updated";
    }
    
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable("courseId") int courseId) {
        cs.deleteById(courseId);
        return "deleted";
    }
    
    @DeleteMapping("/courses/clear")
    public String deleteAllCourses() {
        cs.deleteAllCourses();
        return "All Courses are Deleted";
    }
    
    @GetMapping("/courses/department/{dept}")
    public List<Course> getCourseByDepartment(@PathVariable("dept") String department) {
        return cs.getCourseByDepartment(department);
    }
    
    @PostMapping("/Courses/filter")
    public List<Course> getCourseByDurationAndDepartment(@Param("duration") int duration,
                                                          @Param("department") String department) {
        return cs.getCoursesByDurationAndDepartment(duration, department);
    }
}

