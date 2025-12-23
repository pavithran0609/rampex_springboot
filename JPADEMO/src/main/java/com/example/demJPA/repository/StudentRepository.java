package com.example.demJPA.repository;

import com.example.demJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {
    List<Student> findByTechnology(String str);
    @Query(nativeQuery = true,
   value = "select * from Student WHERE age=: age AND technology=: technology")

    List<Student> findByAge(@Param("age") int age,
                                            @Param("technology") String technology);
}