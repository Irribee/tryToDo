package repository;

import org.springframework.data.repository.CrudRepository;
import web.Task;

public interface ToDoRepository extends CrudRepository<Task, Integer> {
}
