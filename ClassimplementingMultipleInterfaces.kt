package com.example.kotlincodes

// Define an interface called Building with a method doing()
interface Building{
    // The doing() method prints "Building"
    fun doing(){
        println("Building")
    }
}

// Define an interface called Hospital with a method doing()
interface Hospital{
    // The doing() method prints "Hospital"
    fun doing(){
        println("Hospital")
    }
}

// Define a class Mall, which is not an interface, and has an open method doing()
open class Mall{
    // The doing() method prints "Mall"
    open fun doing(){
        println("Mall")
    }
}

// Define a class Player that implements multiple interfaces and inherits from Mall
class Player : Hospital, Building, Mall() {
    // Override the doing() method to change its behavior
    override fun doing(){
        // Call the doing() method from the Mall class
        super<Mall>.doing()
        // Call the doing() method from the Hospital interface
        super<Hospital>.doing()
        // Call the doing() method from the Building interface
        super<Building>.doing()
        // Print "Player" after calling the other methods
        println("Player")
    }
}

// Main function where execution starts
fun main(){
    // Create an instance of Player
    val p = Player()
    // Call the doing() method on the Player instance
    p.doing()
}
