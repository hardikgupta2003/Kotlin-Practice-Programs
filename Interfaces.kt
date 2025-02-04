package com.example.kotlincodes

// Define an interface named Swimmable
interface Swimmable {
    // Abstract property (must be overridden in implementing class)
    val s: String

    // val s2: String = "swimming"  // Not allowed in interfaces (Interfaces cannot hold state)

    // Abstract function (must be implemented in the class that implements this interface)
    fun fn()

    // Default implementation of a function inside an interface
    fun fn2() {
        println("Hello from default implementation of interface")
    }

    // Property with a custom getter (provides a computed value)
    val fn2: String
        get() = "Hello with get function"
}

// Class Swim implements the Swimmable interface
class Swim : Swimmable {
    // Overriding the abstract property 's' from the interface
    override val s: String
        get() = "Hello from the class overriding"

    // Overriding the abstract function fn()
    override fun fn() {
        println("Hello, overriding completed of abstract function of interface")
    }
}

fun main() {
    // Creating an instance of Swim class
    val obj = Swim()
    // Calling the overridden fn() method
    obj.fn()
    // Printing the overridden property 's'
    println(obj.s)
    // Calling fn2() method from the interface (default implementation)
    println(obj.fn2())
}
