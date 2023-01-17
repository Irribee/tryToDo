package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.StatusRepository;
import repository.ToDoRepository;

import java.util.HashMap;

@Controller
@RequestMapping("/start")
public class ToDoListController {
    StatusRepository statusRepository;
    Task task;
    ToDoRepository toDoRepo;
    HashMap<Integer, Task> taskList = new HashMap<>();

    @PostMapping("/new")
    public boolean addTask(int idTask, Task textTask) {
        taskList.put(idTask, textTask);
        return true;
    }

    @GetMapping("/get")
    public Task getTask(int taskId) {
        Task desiredTask = taskList.get(taskId);
        return desiredTask;
    }

    @DeleteMapping("/delete")
    public void removeTask(int idRemove) {
        taskList.remove(idRemove);
    }

    @PatchMapping("/{id}/{status}")
    public Task changedStatus(@PathVariable int id, @PathVariable String status) {
        Task task = toDoRepo.findById(id).get();//найдена задача, соответствующая id
        task.setStatus(status);
        return toDoRepo.save(task);
    }

    public void printTaskList() {
        System.out.println(taskList);
    }

}
