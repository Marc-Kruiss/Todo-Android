package com.example.todo_mvvm.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow
// Says how we access the data from the database
@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo:Todo)
    @Delete
    suspend fun deleteTodo(todo:Todo)
    @Query("Select * from todo where id = :id")
    suspend fun getTodoById(id:Int):Todo?
    @Query("Select * from todo")
    fun getTodos():Flow<List<Todo>>
}