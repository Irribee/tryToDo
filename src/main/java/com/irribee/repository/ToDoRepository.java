package com.irribee.repository;

import com.irribee.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<TaskEntity, Integer> {

}
