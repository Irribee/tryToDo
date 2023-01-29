package com.irribee.controllers;

import com.irribee.dto.TaskDto;
import com.irribee.repository.StatusRepository;
import com.irribee.services.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RequiredArgsConstructor
@Controller
@RequestMapping("/start")
public class ToDoListController {
    StatusRepository statusRepository;
    TaskDto taskDto;

    HashMap<Integer, TaskDto> taskList = new HashMap<>();

    private final ToDoService toDoService;

    @PostMapping("/new")
    public boolean addTask(int idTask, TaskDto textTaskDto) {
        taskList.put(idTask, textTaskDto);
        return true;
    }

    @GetMapping("/get")
    public TaskDto getTask(int taskId) {
        TaskDto desiredTaskDto = taskList.get(taskId);
        return desiredTaskDto;
    }

    @DeleteMapping("/delete")
    public void removeTask(int idRemove) {
        taskList.remove(idRemove);
    }

    @PatchMapping("/{id}/{status}")
    public TaskDto changedStatus(@PathVariable int id, @PathVariable String status) {
        return toDoService.update(id, status);
    }

    public void printTaskList() {
        System.out.println(taskList);
    }

}
