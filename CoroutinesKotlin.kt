package com.example.kotlincodes

import kotlinx.coroutines.*

fun main() = runBlocking {
    // Launch three async tasks concurrently
    val task1 = async { performTask("Task 1", 2000L) } // Runs for 2 seconds
    val task2 = async { performTask("Task 2", 4000L) } // Runs for 4 seconds
    val task3 = async { performTask("Task 3", 2000L) } // Runs for 2 seconds

    println("Waiting for tasks to finish...")

    // Await results from each task and print them once completed
    println("${task1.await()} completed")
    println("${task2.await()} completed")
    println("${task3.await()} completed")
}

// Suspend function that simulates a task with a delay
suspend fun performTask(taskName: String, time: Long): String {
    delay(time) // Simulates processing time
    return taskName // Returns the task name after completion
}

// Another example of suspend function simulating a task
suspend fun performTask1(): String {
    println("Task 1 Timer started")
    delay(2000L) // Simulates a delay of 2 seconds
    return "Performing Task 1 after 2 sec"
}

// Another example of suspend function simulating a task
suspend fun performTask2(): String {
    println("Task 2 Timer started")
    delay(4000L) // Simulates a delay of 4 seconds
    return "Performing Task 2 after 4 sec"
}