package com.example.todo.service;

import com.example.todo.dto.ApiResponse;
import com.example.todo.model.Task;
import org.springframework.http.ResponseEntity;

public interface TaskService {
    public ResponseEntity<ApiResponse> addNewTask(Task task);
    public ResponseEntity<ApiResponse> findAll();
    public void deleteById(int id);
    Iterable<Task> findByDate(String date);
}
