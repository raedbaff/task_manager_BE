package com.raed.taskmanager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raed.taskmanager.exceptions.ResourceNotFoundException;
import com.raed.taskmanager.mappers.TaskMapper;
import com.raed.taskmanager.model.dto.TaskReponse;
import com.raed.taskmanager.model.entity.Task;
import com.raed.taskmanager.repository.TaskRepository;
import com.raed.taskmanager.service.TaskService;
@Service

public class TaskServiceImp implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskReponse getTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task with id " + id + " not found"));
        
        return TaskMapper.toResponse(task);
    }

    @Override
    public TaskReponse createTask(String title, String description) {
        
        throw new UnsupportedOperationException("Unimplemented method 'createTask'");
    }

    @Override
    public TaskReponse updateTask(Long id, String title, String description) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
    }

    @Override
    public TaskReponse deleteTask(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
    }

    @Override
    public List<TaskReponse> getAllTasks() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllTasks'");
    }

}
