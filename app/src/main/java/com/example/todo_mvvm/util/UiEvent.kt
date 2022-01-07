package com.example.todo_mvvm.util

// send events from the view model to the ui
// when something in the view model changes
sealed class UiEvent{
    object PopBackStack:UiEvent()
    data class Navigate(val route:String):UiEvent()
    data class ShowSnackbar(
        val message:String,
        val action:String?=null
    ):UiEvent()
}
