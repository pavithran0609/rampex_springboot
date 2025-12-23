package com.example.course_basic_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Students {
    @Id
    private int id;
    private String email;
    private String name;
    private int courseId;
}
