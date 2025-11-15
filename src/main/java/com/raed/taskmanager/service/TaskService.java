package com.raed.taskmanager.service;

import java.util.List;

import com.raed.taskmanager.model.dto.CreateTaskInput;
import com.raed.taskmanager.model.dto.TaskReponse;
import com.raed.taskmanager.model.dto.UpdateTaskInput;

public interface TaskService {
    TaskReponse getTask(Long id);
    TaskReponse createTask(CreateTaskInput input);
    TaskReponse updateTask(UpdateTaskInput input);
    TaskReponse deleteTask(Long id);
    List<TaskReponse> getAllTasks();


}
