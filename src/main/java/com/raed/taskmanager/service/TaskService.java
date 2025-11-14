package com.raed.taskmanager.service;

import java.util.List;

import com.raed.taskmanager.model.dto.TaskReponse;

public interface TaskService {
    TaskReponse getTask(Long id);
    TaskReponse createTask(String title, String description);
    TaskReponse updateTask(Long id, String title, String description);
    TaskReponse deleteTask(Long id);
    List<TaskReponse> getAllTasks();


}
