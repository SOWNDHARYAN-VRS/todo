package com.example.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity // This tells Hibernate to make a table out of this class

public class Task {
    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String todo;

    private String completionDate;
    private Boolean done;





}