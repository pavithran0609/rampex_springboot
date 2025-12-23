package com.example.course_basic_app.repository;

import com.example.course_basic_app.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface StudentsRepository extends JpaRepository<Students, Integer> {

    List<Students> findByCourseId(int courseId);
}