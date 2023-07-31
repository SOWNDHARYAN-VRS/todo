package com.example.todo.service;

import com.example.todo.model.Task;
import com.example.todo.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {

    @Autowired
    private  UserRepository userRepository;

    public TaskService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Task addNewTask(Task task){
        userRepository.save(task);
        return task;
    }
}
