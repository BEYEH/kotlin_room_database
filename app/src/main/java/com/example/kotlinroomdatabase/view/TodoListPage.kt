package com.example.kotlinroomdatabase.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlinroomdatabase.data.Todo
import com.example.kotlinroomdatabase.data.getFakeTodo
import java.text.SimpleDateFormat
import java.util.Locale


@Composable
fun TodoListPage(modifier: Modifier) {
    val todoList = getFakeTodo()

    Column(modifier = modifier) {
        LazyColumn(
            content = {
                itemsIndexed(todoList) { index: Int, item ->
                    TodoItem(item)
                }
            }
        )
    }
}

@Composable
fun TodoItem(item: Todo) {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Column {
            Text(
                text = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.ENGLISH
                ).format(item.createAt)
            )
            Text(text = item.title)
        }
    }
}
