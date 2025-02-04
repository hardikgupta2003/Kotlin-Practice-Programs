package com.example.kotlincodes

// Class representing a vehicle
class Vehicle {
    var name: String = "Lord Omni"
    var brand: String = "Maruti"
    var year: Int = 2000

    // Function to access vehicle details
    fun carAccess(): String {
        val car1 = Vehicle()
        return "Car name: ${car1.name}, Brand: ${car1.brand}, Year: ${car1.year}"
    }
}

// Class representing a car, initializing a Vehicle instance
class Car {
    val car1 = Vehicle()
    var carName = "Car name: ${car1.name}, Brand: ${car1.brand}, Year: ${car1.year}".also(::println)
}

// Class to perform a calculation with a custom getter
class Calculation(var x: Int) {
    val area: Int
        get() = (this.x * this.x).also { println("Custom getter called") }
}

fun main() {
    val car = Car() // Creating an instance of Car

    val v = Vehicle() // Creating an instance of Vehicle
    v.carAccess() // Accessing vehicle details

    val vari = Vehicle() // Creating another instance of Vehicle

    val cal = Calculation(5) // Creating an instance of Calculation
    println(cal.area) // Accessing custom getter
}
