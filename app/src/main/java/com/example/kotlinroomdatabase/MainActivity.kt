package com.example.kotlinroomdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinroomdatabase.ui.theme.KotlinRoomDatabaseTheme
import com.example.kotlinroomdatabase.view.TodoListPage
import com.example.kotlinroomdatabase.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]

        setContent {
            KotlinRoomDatabaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TodoListPage(
                        modifier = Modifier.padding(innerPadding),
                        todoViewModel
                    )
                }
            }
        }
    }
}
