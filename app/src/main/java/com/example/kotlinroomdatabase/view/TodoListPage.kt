package com.example.kotlinroomdatabase.view

import android.R.attr.text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Row {
        Column {
            Text(
                text = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.ENGLISH
                ).format(item.createAt)
            )
        }
    }
}
