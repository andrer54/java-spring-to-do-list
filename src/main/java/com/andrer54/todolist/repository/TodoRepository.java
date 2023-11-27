package com.andrer54.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrer54.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
