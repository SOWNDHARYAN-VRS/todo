package com.example.todo.dto;

import lombok.Data;

@Data
public class TaskDto {
    private String todo;
    private String deadLine;
    private Boolean isCompleted;
}
