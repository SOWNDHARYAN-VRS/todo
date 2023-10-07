package com.example.todo.repositary;
import com.example.todo.model.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query("SELECT task FROM Task task WHERE task.deadLine = :date")
    Iterable<Task> findByDate(@Param("date") String date);
    //Iterable<Task> findByDate(String deadLine);
}