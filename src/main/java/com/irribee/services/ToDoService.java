package com.irribee.services;

import com.irribee.dto.TaskDto;
import com.irribee.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;

@RequiredArgsConstructor
@Service
@Slf4j
public class ToDoService {

    private final ToDoRepository toDoRepository;
    TaskDto taskDto;

    public TaskDto updateStatus(int id, String status) {
        taskDto = toDoRepository.findById(id);
        String getStatus = taskDto.getStatus();
        taskDto.setStatus(status);
        return taskDto;
    }

    public TaskDto addNewTask(int id, String text, GregorianCalendar date, String status) {
        taskDto.setId(id);
        taskDto.setText(text);
        taskDto.setDate(date);
        taskDto.setStatus(status);
        return taskDto;
    }

    public void removeTask(int id) {
        toDoRepository.removeTaskById(id);
    }

    public TaskDto listTask(TaskDto allTask){

    }
//        Optional<TaskEntity> taskEntityOptional = toDoRepository.findById(id); // найдена задача, соответствующая id
//        TaskEntity taskEntity = null;
//        if (taskEntityOptional.isPresent()) {
//            taskEntity = taskEntityOptional.get();
//        } else {
//            log.error("Не существует id={}", id);
//            throw new RuntimeException("Не существует задавнного id");
//        }
//
//        taskEntity.setStatus(status);
//        var savedEntity = toDoRepository.save(taskEntity);
//
//        var savedTaskDto = new TaskDto();
//        savedTaskDto.setStatus(savedEntity.getStatus());
//
//        return savedTaskDto;
//    }
}
