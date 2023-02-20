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
        String text = taskService.getText();
        return text;//templates
    }

    @PostMapping("/date")
    public GregorianCalendar newDate() {
        GregorianCalendar date = taskService.getDate();
        return date;//templates
    }

    @PostMapping("/status")
    public String newStatus() {
        String status = taskService.getStatus();
        return status;//templates
    }

}
