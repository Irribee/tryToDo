package com.irribee.controllers;

import com.irribee.dto.TaskDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.GregorianCalendar;

@RequestMapping("/newTask")
public class TaskController {
    TaskDto taskDto;
    private GregorianCalendar date;

    @PostMapping("/text")
    public void newText(@PathVariable String text) {
        taskDto.setText(text);
    }

    @PostMapping("/date")
    public void newDate(@PathVariable GregorianCalendar date) {
        this.date = date;
        taskDto.setDate(date);
    }

    @PostMapping("/status")
    public void newStatus(@PathVariable String status) {
        taskDto.setStatus("новая");
    }

}
