package com.lexalab.todolist.service;

import com.lexalab.todolist.entity.Todo;
import com.lexalab.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> list(){
        Sort.by()
        todoRepository.findAll();
    }

    public List<Todo> update() {}

    public List<Todo> delete() {}
}
