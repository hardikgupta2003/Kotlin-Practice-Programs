package com.example.kotlincodes

// Singleton class ensuring only one instance exists
object Singleton {
    private var count = 0

    fun increment() {
        count++
        println("Current count: $count")
    }
}

fun main() {
    // Accessing Singleton instance and calling its function
    Singleton.increment()
    Singleton.increment()
}
