package com.example.course_basic_app.controller;

import com.example.course_basic_app.Service.CourseService;
import com.example.course_basic_app.Service.StudentService;
import com.example.course_basic_app.model.Courses;
import com.example.course_basic_app.model.Students;
import com.example.course_basic_app.repository.CourseRepository;
import com.example.course_basic_app.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
    CourseService cs;
    @Autowired
    StudentService ss;
    @GetMapping("/available-courses")
    public List<Courses> getAvailableCourses() {
        return cs.getAllCourses();
    }
    @GetMapping("/enrolled-students/{courseId}")
    public List<Students> getEnrolledStudents(@PathVariable int courseId){
        return ss.getStudentsByCourseId(courseId);
    }
    @PostMapping("/register-course")
    public String registerCourse(@RequestBody Students student) {
        ss.registerStudent(student);
        return "Student registered to course";
    }



}
