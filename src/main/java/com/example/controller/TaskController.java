package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Task;

import com.example.service.TaskService;

@RestController

@RequestMapping("/tasks")

public class TaskController {

    @Autowired

    private TaskService taskService;

    @PostMapping

    public ResponseEntity<Task> createTask(@RequestBody Task task) {

        Task savedTask = taskService.save(task);

        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);

    }

}


