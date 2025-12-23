package com.example.demJPA.service;

import com.example.demJPA.model.Course;
import com.example.demJPA.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository cr;
    
    public List<Course> getAllCourses() {
        return cr.findAll();
    }

    public Course addCourse(Course course) {
        return cr.save(course);
    }

    public Optional<Course> getCourseById(int courseId) {
        return cr.findById(courseId);
    }
    
    public Course getCourseByIdDirect(int courseId) {
        return cr.getById(courseId);
    }
    
    public void updateCourse(Course course) {
        cr.save(course);
    }
    
    public void deleteById(int courseId) {
        cr.deleteById(courseId);
    }

    public void deleteAllCourses() {
        cr.deleteAll();
    }

    public List<Course> getCourseByDepartment(String department) {
        return cr.findByDepartment(department);
    }

    public List<Course> getCoursesByDurationAndDepartment(int duration, String department) {
        return cr.findByDurationAndDepartment(duration, department);
    }
}

