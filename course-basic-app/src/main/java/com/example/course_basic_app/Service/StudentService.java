package com.example.course_basic_app.Service;

import com.example.course_basic_app.model.Courses;
import com.example.course_basic_app.model.Students;
import com.example.course_basic_app.repository.CourseRepository;
import com.example.course_basic_app.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentsRepository cs;
    public List<Students> getAllStudents(){
        return cs.findAll();
    }

    public List<Students> getStudentsByCourseId(int courseId) {
        return cs.findByCourseId(courseId);
    }
    public Students registerStudent(Students student){
        return cs.save(student);
    }

}
