package com.example.course_basic_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Courses{
    @Id
    private int id;
    private String name;
    private int duration;
}
