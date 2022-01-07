package com.example.todo_mvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase
// Class for Room to generate a database for the To-do Entities
@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase:RoomDatabase() {

    abstract val dao:TodoDao
}