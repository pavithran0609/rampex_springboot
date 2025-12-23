package com.example.demJPA.service;

import com.example.demJPA.model.Student;
import com.example.demJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void deleteById(int rno) {
        sr.deleteById(rno);
    }

    public void deleteAllStudent() {
        sr.deleteAll();
    }

    public List<Student> getStudentByTechnology(String str) {
    return sr.findByTechnology(str);
    }

    public List<Student> getStudentsByAgeAndTechnology(int age, String technology) {
        return sr.findByAge(age,technology);
    }
}