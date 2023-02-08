package com.irribee.controllers;

import com.irribee.dto.TaskDto;
import com.irribee.services.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequiredArgsConstructor
@Controller
@RequestMapping("/start")
public class ToDoListController {

    TaskDto taskDto;

    HashMap<Integer, TaskDto> taskList = new HashMap<>();

    private final ToDoService toDoService;

    @PostMapping("/new")
    public TaskDto addTask() {
        return new TaskDto();
    }

    @GetMapping("/get")
    public TaskDto getTask() {
        return new TaskDto();
    }

    @DeleteMapping("/delete")
    public String removeTask(int idRemove) {
        return "removed";
    }

    @PatchMapping("/{id}/{status}")
    public String changedStatus() {
        return "changed";
    }

    public void printTaskList() {
        System.out.println(taskList);
    }

}
