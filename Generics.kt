package com.example.kotlincodes

// Generic function to print a list of items
fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

// Class containing a generic function to print a greeting message
class Printin {
    fun <X> Greeting(List: List<X>) {
        for (el in List) {
            println(el)
        }
    }
}

// Generic function with a default display mechanism
fun <T> DefDispaly(value: T?): T? {
    return value ?: defaultValue(value)
}

// Function to provide a default value if the input is null
fun <T> defaultValue(value: T): T {
    return value.also { println("value null hai isiliye me aaya hu  -> $it ") }
}

fun main() {
    val intList = listOf(1, 2, 3)
    val stringList = listOf("a", "b", "c")
    val boolList = listOf(1.0, 2.6, 34, 7.8)

    // Printing different types of lists
    Printin().Greeting(boolList)

    // Demonstrating default display function with null handling
    DefDispaly(null).also(::println)
}