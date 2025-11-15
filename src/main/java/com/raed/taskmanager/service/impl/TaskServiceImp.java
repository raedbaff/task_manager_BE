package com.raed.taskmanager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raed.taskmanager.exceptions.ResourceNotFoundException;
import com.raed.taskmanager.mappers.TaskMapper;
import com.raed.taskmanager.model.dto.CreateTaskInput;
import com.raed.taskmanager.model.dto.TaskReponse;
import com.raed.taskmanager.model.dto.UpdateTaskInput;
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
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task with id " + id + " not found"));

        return TaskMapper.toResponse(task);
    }

    @Override
    public TaskReponse createTask(CreateTaskInput input) {
        Task task = new Task();
        task.setTitle(input.title());
        task.setDescription(input.description());
        taskRepository.save(task);
        return TaskMapper.toResponse(task);
    }

    @Override
    public TaskReponse updateTask(UpdateTaskInput input) {
        Task task = taskRepository.findById(input.id())
                .orElseThrow(() -> new ResourceNotFoundException("Task with id " + input.id() + " not found"));
        task.setTitle(input.title());
        task.setDescription(input.description());
        task.setCompleted(input.completed());
        taskRepository.save(task);
        return TaskMapper.toResponse(task);

    }

    @Override
    public TaskReponse deleteTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task with id " + id + " not found"));
        taskRepository.delete(task);
        return TaskMapper.toResponse(task);

    }

    @Override
    public List<TaskReponse> getAllTasks() {

        List<Task> tasks = taskRepository.findAll();
        return tasks.stream().map(TaskMapper::toResponse).toList();

    }

}
