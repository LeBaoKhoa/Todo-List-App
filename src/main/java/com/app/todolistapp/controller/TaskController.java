package com.app.todolistapp.controller;

import com.app.todolistapp.models.Task;
import com.app.todolistapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getTasks(Model model, @RequestParam(required = false) String search) {
        List<Task> tasks = (search != null && !search.isEmpty())
                ? taskService.searchTasks(search)
                : taskService.getAllTasks();

        long completedCount = tasks.stream().filter(Task::isCompleted).count();
        model.addAttribute("tasks", tasks);
        model.addAttribute("completedCount", completedCount);
        model.addAttribute("search", search);
        return "tasks";
    }

    @PostMapping("/create")
    public String createTask(@RequestParam String title,
                             @RequestParam String description,
                             @RequestParam String deadline,
                             @RequestParam Task.Priority priority) {
        taskService.createTask(title, description, LocalDate.parse(deadline), priority);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable Long id, Model model) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "edit";
    }

    @PostMapping("/{id}/update")
    public String updateTask(@PathVariable Long id,
                             @RequestParam String title,
                             @RequestParam String description,
                             @RequestParam String deadline,
                             @RequestParam Task.Priority priority) {
        taskService.updateTask(id, title, description, LocalDate.parse(deadline), priority);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
