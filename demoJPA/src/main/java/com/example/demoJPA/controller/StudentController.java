package com.example.demoJPA.controller;
import com.example.demoJPA.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.demoJPA.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    StudentService s;
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }
    @GetMapping("/csrf-token")
    public CsrfToken getcsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student str) {
        s.addStudent(str) ;
        return "added";
    }

    @GetMapping("/students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rnoo){
        return s.getAllStudentsById(rnoo);
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student str){
        s.updateStudent(str);
        return "updated";
    }
}
