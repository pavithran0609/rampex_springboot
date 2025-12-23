package com.example.demJPA.controller;

import com.example.demJPA.model.Student;
import com.example.demJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }

    @PostMapping("students")
    public Student addStudent(@RequestBody Student str) {
        return s.addStudent(str);
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
    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno){
        s.deleteById(rno);
        return "deleted";
    }
    @DeleteMapping("/students/clear")
    public String deleteAllStudent(){
        s.deleteAllStudent();
        return "All Student are Deleted";
    }
    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentByTechnology(@PathVariable("tech") String str){
     return  s.getStudentByTechnology(str);
    }
    @PostMapping("/Students/filter")
    public List<Student> getStudentByageAndTechnology(@Param("age") int age,
                                                         @Param("technology") String technology){
      return   s.getStudentsByAgeAndTechnology(age,technology);


    }
}