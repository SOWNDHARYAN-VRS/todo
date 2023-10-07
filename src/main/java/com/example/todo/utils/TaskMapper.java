package com.example.todo.utils;

import com.example.todo.dto.TaskDto;
import com.example.todo.model.Task;

public class TaskMapper {


    public static Task dtoToEntity(TaskDto taskDto) {
        Task task = new Task();
        task.setTodo(taskDto.getTodo());
        task.setDeadLine(taskDto.getDeadLine());
        task.setIsCompleted(taskDto.getIsCompleted());
        return task;
    }
}
