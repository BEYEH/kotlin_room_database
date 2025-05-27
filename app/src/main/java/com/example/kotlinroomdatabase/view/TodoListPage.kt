package com.example.kotlinroomdatabase.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kotlinroomdatabase.data.getFakeTodo


@Composable
fun TodoListPage(modifier: Modifier) {
    val todoList = getFakeTodo()

    Column(modifier = modifier) {
        LazyColumn(
            content = {
                itemsIndexed(todoList) { index: Int, item ->
                    Text(text = item.toString())
                }
            }
        )
    }
}