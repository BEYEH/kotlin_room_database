package com.example.kotlinroomdatabase.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinroomdatabase.model.Todo

class TodoVIewModel : ViewModel() {
    private val _todoList = MutableLiveData<List<Todo>>()
    var todoList: LiveData<List<Todo>> = _todoList

    fun getAllTodo() {
    }

    fun addTodo() {
    }

    fun deleteTodo() {
    }
}