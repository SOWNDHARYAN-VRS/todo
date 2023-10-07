package com.example.todo.service;

import com.example.todo.dto.ApiResponse;
import com.example.todo.model.Task;
import com.example.todo.repositary.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Override
    public ResponseEntity<ApiResponse> addNewTask(Task task){
        taskRepository.save(task);
        return ResponseEntity.ok(new ApiResponse(true,"Task saved",null));
    }
    @Override
    public ResponseEntity<ApiResponse> findAll(){
        return ResponseEntity.ok(new ApiResponse(true,"Tasks are retrieved",taskRepository.findAll()));
    }
    @Override
    public void deleteById(int id) {taskRepository.deleteById(id);}
    @Override
    public Iterable<Task> findByDate(String date){return taskRepository.findByDate(date);}
}
