package com.irribee.repository;

import com.irribee.dto.TaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class ToDoRepository {
    private static final Map<Integer, TaskDto> toDoMap = new HashMap<>();//до этого был TaskEntity
    TaskDto taskDto;

    public TaskDto findById(int id) {
        TaskDto taskById;
        if (toDoMap.containsKey(id)) {
            taskById = toDoMap.get(id);
        } else {
            log.error("Не существует id={}", id);
            throw new RuntimeException("Не существует задавнного id");
        }
        return taskById;
    }

    public TaskDto removeTaskById(int id) {
        TaskDto taskDeleteById = toDoMap.remove(id);
        return taskDeleteById;
    }



}

//    public Optional<TaskEntity> findById(int id) {
//        return Optional.ofNullable(toDoMap.get(id));
//    }
}
