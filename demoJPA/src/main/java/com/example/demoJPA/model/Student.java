package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rno;
    private String gendre;
    private String name;
    private String technology;

}