package com.irribee.repository;

import com.irribee.entity.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ToDoRepository {
    private static final Map<Integer, TaskEntity> toDoMap = new HashMap<>();


    public Optional<TaskEntity> findById(int id) {
        return Optional.ofNullable(toDoMap.get(id));
    }
}
