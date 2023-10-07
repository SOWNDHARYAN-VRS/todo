package com.example.todo.controller;
import com.example.todo.dto.ApiResponse;
import com.example.todo.dto.TaskDto;
import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import com.example.todo.utils.TaskMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/todo")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping(path="/add-task")
    public ResponseEntity<ApiResponse> addNewTask (@RequestBody TaskDto taskDto){
       return taskService.addNewTask(TaskMapper.dtoToEntity(taskDto));
    }
    @GetMapping(path="/all-tasks")
    public ResponseEntity<ApiResponse> getAllTask(HttpServletRequest request) {
        return taskService.findAll();
    }
    @DeleteMapping("/delete-task")
    public void deleteById(@RequestParam int id){
        taskService.deleteById(id);
    }
    @GetMapping("/date-filter")
    public Iterable<Task> findByDate(@RequestParam String deadLine){
        return taskService.findByDate(deadLine);
    }

}