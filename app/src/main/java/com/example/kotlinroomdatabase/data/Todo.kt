package com.example.kotlinroomdatabase.data

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createAt: Date
)

fun getFakeTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(1, "First todo", Date.from(Instant.now())),
        Todo(2, "Second todo", Date.from(Instant.now())),
        Todo(3, "Third todo", Date.from(Instant.now())),
        Todo(4, "Fourth todo", Date.from(Instant.now()))
    )
}
