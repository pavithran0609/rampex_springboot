package com.example.demJPA.repository;

import com.example.demJPA.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findByDepartment(String department);
    
    @Query(nativeQuery = true,
           value = "select * from Course WHERE duration=:duration AND department=:department")
    List<Course> findByDurationAndDepartment(@Param("duration") int duration,
                                              @Param("department") String department);
}

