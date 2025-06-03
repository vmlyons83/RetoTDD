package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import com.example.model.Task;

import com.example.service.TaskService;

@WebMvcTest(TaskController.class)

public class TaskControllerTest {

    @Autowired

    private MockMvc mockMvc;

    @MockBean

    private TaskService taskService;

    /* @Test

   void crearTareaDesdeEndpoint() throws Exception {

        Task tarea = new Task("Leer", "Leer Clean Code");

        tarea.setId(1L);

        when(taskService.save(any(Task.class))).thenReturn(tarea);

        mockMvc.perform(post("/tasks")

                .contentType(MediaType.APPLICATION_JSON)

                .content("{"title":"Leer","description":"Leer Clean Code"}"))

                .andExpect(status().isCreated())

                .andExpect(jsonPath("$.id").value(1))

                .andExpect(jsonPath("$.title").value("Leer"))

                .andExpect(jsonPath("$.description").value("Leer Clean Code"));

    }

     */

}

