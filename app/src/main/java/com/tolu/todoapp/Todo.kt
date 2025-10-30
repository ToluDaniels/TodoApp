package com.tolu.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    val id: Int,
    val title: String,
    val createAt: Date
)




fun getFakeTodo(): List<Todo>{
    return listOf(
        Todo(1, "First todo", Date.from(Instant.now())),
        Todo(2, "Second Todo", Date.from(Instant.now())),
        Todo(3, "this is my third todo", Date.from(Instant.now())),
        Todo(4, "this is my fourth todo so that i can use it in UI", Date.from(Instant.now()))

    );
}