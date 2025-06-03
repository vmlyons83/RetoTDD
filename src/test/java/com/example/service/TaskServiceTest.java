package com.example.service;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Task;

import com.example.repository.TaskRepository;

@SpringBootTest

public class TaskServiceTest {

    @Mock

    private TaskRepository repository;

    @InjectMocks

    private TaskService service;

    @Test

    void guardarTarea() {

        Task tarea = new Task("Aprender", "Aprender BDD");

        when(repository.save(any(Task.class))).thenReturn(tarea);

        Task resultado = service.save(tarea);

        assertEquals("Aprender", resultado.getTitle());

    }

}


