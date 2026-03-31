package dev.afinovicz.todolistproject.controller;

import dev.afinovicz.todolistproject.domain.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
