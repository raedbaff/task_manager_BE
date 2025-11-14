package com.raed.taskmanager.mappers;

import com.raed.taskmanager.model.dto.TaskReponse;
import com.raed.taskmanager.model.entity.Task;

public class TaskMapper {
    public static TaskReponse toResponse(Task task) {
        TaskReponse response = new TaskReponse();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCompleted(task.isCompleted());
        return response;
    }
}
