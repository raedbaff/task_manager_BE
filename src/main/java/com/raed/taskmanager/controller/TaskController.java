package com.raed.taskmanager.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raed.taskmanager.model.dto.CreateTaskInput;
import com.raed.taskmanager.model.dto.TaskReponse;
import com.raed.taskmanager.model.dto.UpdateTaskInput;
import com.raed.taskmanager.service.TaskService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskReponse> getTask(@PathVariable Long id) {
        TaskReponse task = taskService.getTask(id);
        return ResponseEntity.ok().body(task);

    }

    @GetMapping()
    public ResponseEntity<List<TaskReponse>> getAllTasks() {
        List<TaskReponse> tasks = taskService.getAllTasks();
        return ResponseEntity.ok().body(tasks);

    }

    @PostMapping()
    public ResponseEntity<TaskReponse> createTask(@Valid @RequestBody CreateTaskInput input) {
        TaskReponse task = taskService.createTask(input);
        return ResponseEntity.ok().body(task);

    }

    @PutMapping()
    public ResponseEntity<TaskReponse> updateTask(@Valid @RequestBody UpdateTaskInput input) {
        TaskReponse task = taskService.updateTask(input);
        return ResponseEntity.ok().body(task);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaskReponse> deleteTask(@PathVariable Long id) {
        TaskReponse task = taskService.deleteTask(id);
        return ResponseEntity.ok().body(task);

    }

}
