package com.todo.restapi.demo.repository;

import com.todo.restapi.demo.models.Todo;
import org.springframework.data.repository.Repository;


import java.util.List;

@org.springframework.stereotype.Repository
public interface TodoRepository extends Repository<Todo, Long> {

    public List<Todo> findAll();

    public Todo save(Todo todo);
}
