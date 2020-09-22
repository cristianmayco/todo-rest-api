package com.todo.restapi.demo.services;

import com.todo.restapi.demo.models.Todo;
import com.todo.restapi.demo.repository.TodoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo save(Todo todo){
        return todoRepository.save(todo);
    }
}
