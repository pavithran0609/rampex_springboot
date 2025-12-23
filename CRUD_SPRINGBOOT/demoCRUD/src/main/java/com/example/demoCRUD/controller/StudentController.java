package com.example.demoCRUD.controller;

import com.example.demoCRUD.model.Student;
import com.example.demoCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService sc;

    @GetMapping("Students")
    public List<Student> getStudent()
    {
        return sc.getStudent();
    }

    @GetMapping("Students/{no}")
    public Student getStudentByRollno(@PathVariable("no")int no){
        return sc.getStudentByRollno(no);
    }

    @GetMapping(Students)
    public String setStudents(@RestController){
        return sc.getStudents(stu);
    }
}
