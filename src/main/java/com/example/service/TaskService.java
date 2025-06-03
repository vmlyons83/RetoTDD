package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.model.Task;

import com.example.repository.TaskRepository;

@Service

public class TaskService {

    @Autowired

    private TaskRepository taskRepository;

    public Task save(Task task) {

        return taskRepository.save(task);

    }

}


