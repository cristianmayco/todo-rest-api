package com.todo.restapi.demo.resources;

import com.todo.restapi.demo.models.Todo;
import com.todo.restapi.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoResource {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo newTodo = todoService.save(todo);

        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);

    }
}
