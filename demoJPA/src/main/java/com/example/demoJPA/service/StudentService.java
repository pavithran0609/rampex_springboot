package com.example.demoJPA.service;
import java.util.List;
import java.util.Optional;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    public Student addStudent(Student student) {
        return sr.save(student);
    }

    public Optional<Student> getStudentByRno(int rno){
        return sr.findById(rno);
    }

    public Student getAllStudentsById(int rnoo) {
        return sr.getById(rnoo);
    }
    public void updateStudent(Student str){
        sr.save(str);
    }
}
