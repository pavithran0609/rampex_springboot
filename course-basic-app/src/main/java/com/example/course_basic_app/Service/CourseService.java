package com.example.course_basic_app.Service;

import com.example.course_basic_app.model.Courses;
import com.example.course_basic_app.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CourseService {
    @Autowired
    CourseRepository cr;
    public List<Courses> getAllCourses(){
        return cr.findAll();
    }

}
