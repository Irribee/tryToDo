package web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.GregorianCalendar;

@RequestMapping("/newTask")
public class TaskController {
    Task task;
    private GregorianCalendar date;

    @PostMapping("/text")
    public void newText(@PathVariable String text) {
        task.setText(text);
    }

    @PostMapping("/date")
    public void newDate(@PathVariable GregorianCalendar date) {
        this.date = date;
        task.setDate(date);
    }

    @PostMapping("/status")
    public void newStatus(@PathVariable String status) {
        task.setStatus("новая");
    }
}
