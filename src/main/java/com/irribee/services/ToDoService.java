package com.irribee.services;

import com.irribee.dto.TaskDto;
import com.irribee.entity.TaskEntity;
import com.irribee.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public TaskDto update(int id, String status) {
        Optional<TaskEntity> taskEntityOptional = toDoRepository.findById(id); // найдена задача, соответствующая id
        TaskEntity taskEntity = null;
        if (taskEntityOptional.isPresent()) {
            taskEntity = taskEntityOptional.get();
        } else {
            log.error("Не существует id={}", id);
            throw new RuntimeException("Не существует задавнного id");
        }

        taskEntity.setStatus(status);
        var savedEntity = toDoRepository.save(taskEntity);

        var savedTaskDto = new TaskDto();
        savedTaskDto.setStatus(savedEntity.getStatus());

        return savedTaskDto;
    }
}
