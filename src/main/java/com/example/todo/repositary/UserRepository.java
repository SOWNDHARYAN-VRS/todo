package com.example.todo.repositary;
import com.example.todo.model.Task;

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<Task, Integer> {

}