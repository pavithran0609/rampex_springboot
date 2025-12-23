package com.example.course_basic_app.repository;
import com.example.course_basic_app.model.Courses;
import com.example.course_basic_app.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CourseRepository extends JpaRepository<Courses, Integer> {
}