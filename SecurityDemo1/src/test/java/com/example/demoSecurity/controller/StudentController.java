package com.example.demoSecurity.controller;

import com.example.demoSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    List<Student> s= new ArrayList<>(
            Arrays.asList(
                    new Student(1,"ish","java"),
                    new Student(2,"virat","javasprring")
            )
    );

    @GetMapping("/Students")
    public List<Student> getStudents(){
        return s;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getcsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/Students")
    public String addStudents(@RequestBody Student stu){
        s.add(stu);
        return "added";
    }
}