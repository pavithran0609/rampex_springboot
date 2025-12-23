package com.example.demoCRUD.service;

import com.example.demoCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> s = new ArrayList<>(
    Arrays.asList(
            new Student(1,"steve","app"),
            new Student(2,"musk","networking"))

    );


    public List<Student> getStudent() {

        return s;

    }

    public Student getStudentByRollno(int rollno){
        int index=0;
        for(int i=0;i<s.size();i++)
        {
            if(s.get(i).getNo()==rollno)
            {
                index=i;
                break;
            }
        }
        return s.get(index);
    }
    public String setStudent(Student stu){
        s.add(stu);
    }
}
