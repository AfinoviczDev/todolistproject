package dev.afinovicz.todolistproject.controller;

import dev.afinovicz.todolistproject.domain.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodoListController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Task>> listTasks() {
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public void createTask(@RequestBody Task task) {
        tasks.add(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        tasks.removeIf(task -> task.id().equals(id));
        return ResponseEntity.noContent().build();
    }

}
