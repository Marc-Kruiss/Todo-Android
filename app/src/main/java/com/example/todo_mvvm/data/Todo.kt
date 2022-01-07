package com.example.todo_mvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey
// Contains what we want so save for a
// single item
@Entity
data class Todo(
    val title:String,
    val description:String?,
    val isDone:Boolean,
    @PrimaryKey val id:Int? = null
)
