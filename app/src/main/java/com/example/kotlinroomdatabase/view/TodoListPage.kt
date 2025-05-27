package com.example.kotlinroomdatabase.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinroomdatabase.R
import com.example.kotlinroomdatabase.model.Todo
import com.example.kotlinroomdatabase.model.getFakeTodo
import java.text.SimpleDateFormat
import java.util.Locale


@Composable
fun TodoListPage(modifier: Modifier) {
    val todoList = getFakeTodo()
    var inputText by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 0.dp, vertical = 8.dp),
        ) {
            OutlinedTextField(value = inputText, onValueChange = {
                inputText = it
            })
            Button(onClick = {}) {
                Text(text = "Add")
            }
        }

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
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss",
                    Locale.ENGLISH
                ).format(item.createAt),
                fontSize = 16.sp,
                color = Color.White
            )
            Text(
                text = item.title,
                fontSize = 20.sp,
                color = Color.White
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_delete_24),
                contentDescription = "Delete",
                tint = Color.White
            )
        }
    }
}
