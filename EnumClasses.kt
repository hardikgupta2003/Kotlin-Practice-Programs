package com.example.kotlincodes

// Enum class representing different modes
enum class Modes(val clr: Int) {
    DARK(1), LIGHT(2), DEVELOPMENT(3);

    // Function to check if the mode contains DARK
    fun containsDark() = (this.clr and 1 != 0)
}

fun main() {
    val d = Modes.DARK // Selecting DARK mode

    // Using when-expression to determine the mode
    val ans = when (d) {
        Modes.LIGHT -> "Light mode on krdiya hai"
        Modes.DARK -> "Dark mode on krdiya hai"
        Modes.DEVELOPMENT -> "Development mode on krdiya hai"
    }

    println(ans) // Printing selected mode message

    println(d.containsDark()) // Checking if DARK mode is active

    // Iterating over all enum entries and printing them
    for (modes in Modes.entries) {
        println(modes)
    }

    // Getting enum value by name
    println(Modes.valueOf("DARK"))
    // Printing the ordinal (position) of DEVELOPMENT mode
    println(Modes.DEVELOPMENT.ordinal)
}
