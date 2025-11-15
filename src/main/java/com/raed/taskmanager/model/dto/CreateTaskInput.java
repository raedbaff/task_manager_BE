package com.raed.taskmanager.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateTaskInput(
        @NotBlank(message = "Title is required") String title,
        @Size(max = 1000, message = "Description must be at most 1000 characters") String description) {
}