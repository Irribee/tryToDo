package com.irribee.controllers;

import com.irribee.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.GregorianCalendar;

@Controller
@RequestMapping("/newTask")
public class TaskController {
    TaskService taskService;

    @PostMapping("/text")
    public String newText() {
        taskService.getText();
        return "";//templates
    }

    @PostMapping("/date")
    public GregorianCalendar newDate() {
        taskService.getDate();
        return "";//templates
    }

    @PostMapping("/status")
    public String newStatus() {
        taskService.getStatus();
        return n"";//templates
    }

}
