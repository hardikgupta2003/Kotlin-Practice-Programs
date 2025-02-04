package com.example.kotlincodes

// Sealed class representing different result states
sealed class Result{

    // Success state holding some data
    data class Success(val data : String) : Result()

    // Error state holding an error message
    data class Error(val message : String) : Result()
}

// Function to handle different result types
fun handleResult(result : Result){
    when(result){
        is Result.Success -> println("Success : ${result.data}")
        is Result.Error -> println("Error Occurred : ${result.message}")
    }
}

// Sealed class representing different types of users in the app
sealed class App{
    abstract fun display()

    class Admin : App(){
        override fun display() {
            println("Me admin hu") // Admin-specific display message
        }
    }

    class User : App(){
        override fun display() {
            println("Me User hu") // User-specific display message
        }
    }
}

// Function to display the type of user
fun displaying(app : App){
    when(app){
        is App.User -> app.display() // Handling User case
        is App.Admin -> app.display() // Handling Admin case
        else -> println("Exception")
    }
}

// Sealed class representing different states
sealed class State {
    abstract fun handle()
}

// Object representing an idle state
object IdleState : State() {
    override fun handle() {
        // Do nothing
    }
}

// Object representing an active state
object ActiveState : State() {
    override fun handle() {
        // Do something when in active state
    }
}

// Object representing an inactive state
object InactiveState : State() {
    override fun handle() {
        // Do something when in inactive state
    }
}

fun main(){
    val resSuccess = Result.Success("My name is Hardik Gupta")
    val resError = Result.Error("Name error!")

    handleResult(resSuccess) // Handling success case

    displaying(App.User()) // Displaying user-specific message
}
