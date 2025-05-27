package com.example.kotlinroomdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinroomdatabase.ui.theme.KotlinRoomDatabaseTheme
import com.example.kotlinroomdatabase.view.TodoListPage
import com.example.kotlinroomdatabase.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]

        setContent {
            KotlinRoomDatabaseTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    TodoListPage(
                        todoViewModel
                    )
                }
            }
        }
    }
}
