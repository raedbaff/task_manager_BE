package com.raed.taskmanager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskReponse {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

}
