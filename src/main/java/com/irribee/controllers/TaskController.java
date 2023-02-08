package com.irribee.controllers;

import com.irribee.services.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.GregorianCalendar;

@RequestMapping("/newTask")
public class TaskController {
    TaskService taskService;

    @PostMapping("/text/{writeText}")
    public String newText() {
        taskService.getText();
        return newText();
    }

    @PostMapping("/date")
    public GregorianCalendar newDate() {
        taskService.getDate();
        return newDate();
    }

    @PostMapping("/status")
    public String newStatus() {
        taskService.getStatus();
        return newStatus();
    }

}
