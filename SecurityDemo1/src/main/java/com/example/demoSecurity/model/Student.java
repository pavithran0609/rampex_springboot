package com.example.demoSecurity.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int rno;
    private String name;
    private String technology;

//    public Student(int i, String virat, String tech) {
//        this.rno=i;
//        this.name=virat;
//        this.technology=tech;
//    }
//
//    public Student() {
//    }
}
