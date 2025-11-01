package com.app.todolistapp.services;

import com.app.todolistapp.models.Task;
import com.app.todolistapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title, String description, LocalDate deadline, Task.Priority priority) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(deadline);
        task.setPriority(priority);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow();
    }

    public void updateTask(Long id, String title, String description, LocalDate deadline, Task.Priority priority) {
        Task task = getTaskById(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(deadline);
        task.setPriority(priority);
        taskRepository.save(task);
    }

    public List<Task> searchTasks(String keyword) {
        return taskRepository.findAll().stream()
                .filter(task -> task.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}

