package com.example.kotlincodes


sealed class Result{

    data class Success(val data : String) : Result()

    data class Error(val message : String) : Result()
}

fun handleResult(result : Result){
    when(result){
        is Result.Success -> println("Success : ${result.data}")
        is Result.Error -> println("Error Occured : ${result.message}")
    }
}

sealed class App{
    abstract fun display()
    class Admin : App(){
        override fun display() {
            println("Me admin hu")
        }
    }

    class User : App(){
        override fun display() {
            println("Me User hu")
        }
    }
}

fun displaying(app : App){
    when(app){
        is App.User -> app.display()
        is App.User -> app.display()
        else -> println("exception")
    }
}


sealed class State {
    abstract fun handle()
}

object IdleState : State() {
    override fun handle() {
        // Do nothing
    }
}

object ActiveState : State() {
    override fun handle() {
        // Do something when in active state
    }
}

object InactiveState : State() {
    override fun handle() {
        // Do something when in inactive state
    }
}


fun main(){
    val resSuccess = Result.Success("My name is Hardik gupta")
    val resError = Result.Error("Name error!")

   handleResult(resSuccess)

    displaying(App.User())

}