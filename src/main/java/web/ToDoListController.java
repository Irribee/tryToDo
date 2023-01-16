package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.StatusRepository;
import repository.ToDoRepository;

import java.util.HashMap;
import java.util.Optional;

@Controller
@RequestMapping ("/start")
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
    @GetMapping ("/get")
    public Task getTask(int taskId) {
        Task desiredTask = taskList.get(taskId);
        return desiredTask;
    }
    @DeleteMapping ("/delete")
    public void removeTask(int idRemove) {
        taskList.remove(idRemove);
    }
//@PutMapping("/{id}/{status}")
//    public String changedStatus (@PathVariable int id,@PathVariable String status){
//    Optional<Task> setNewstatus=toDoRepo.findById(id);
//    Task.
//тут пока не знаю, как сделать
//}



    public void printTaskList() {
        System.out.println(taskList);
    }

}
