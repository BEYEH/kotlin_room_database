package com.example.kotlinroomdatabase.viewmodel

import com.example.kotlinroomdatabase.model.Todo
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()

    fun getAllTodo(): List<Todo> {
        return todoList
    }

    fun addTodo(title: String) {
        todoList.add(
            Todo(
                id = System.currentTimeMillis().toInt(),
                title = title,
                createAt = Date.from(Instant.now())
            )
        )
    }

    fun deleteTodo(id: Int) {
        todoList.removeIf { it.id == id }
    }
}