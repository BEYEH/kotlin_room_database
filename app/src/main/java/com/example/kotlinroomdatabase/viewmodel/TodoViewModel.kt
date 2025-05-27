package com.example.kotlinroomdatabase.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinroomdatabase.model.Todo

class TodoViewModel : ViewModel() {
    private val _todoList = MutableLiveData<List<Todo>>()
    var todoList: LiveData<List<Todo>> = _todoList

    fun getAllTodo() {
        _todoList.value = TodoManager.getAllTodo()
    }

    fun addTodo(title: String) {
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id: Int) {
        TodoManager.deleteTodo(id)
        getAllTodo()
    }
}