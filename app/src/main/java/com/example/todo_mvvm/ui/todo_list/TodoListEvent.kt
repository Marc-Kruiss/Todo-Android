package com.example.todo_mvvm.ui.todo_list

import com.example.todo_mvvm.data.Todo

// events from the ui to the view model
sealed class TodoListEvent{
    data class OnDeleteTodoClick(val todo:Todo):TodoListEvent()
    data class OnDoneChange(val todo:Todo, val isDone:Boolean):TodoListEvent()
    object OnUndoDeleteClick:TodoListEvent()
    data class OnTodoClick(val todo:Todo):TodoListEvent()
    object OnAddTodoClick:TodoListEvent()
}
