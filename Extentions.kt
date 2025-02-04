package com.example.kotlincodes

// Define an extension function for the String class that concatenates three strings
fun String.concat(s2: String, s3: String): String {
    return this + s2 + s3  // Concatenate the current string (this) with s2 and s3
}

// Define an infix function for the Int class that checks if one integer is greater than another
infix fun Int.checkGreater(other: Int): Boolean {
    return if (this > other) true else false  // Return true if the current integer (this) is greater than the other integer
}

fun main() {
    // String variables
    val s1 = "Hardik "
    val s2 = "Gupta "
    val s3 = "Here!"

    // Concatenating strings without using the extension function
    val name = s1 + s2 + s3
    println("Printing name using without extension function: " + name)

    // Using the extension function to concatenate strings
    val extName = s1.concat(s2, s3)
    println("Printing name using extension function: " + extName)

    // Integer variables for comparison
    val x = 20
    val y = 25

    // Comparing integers without using the extension function
    val output = if (x > y) println("x is greater!") else println("y is greater!")

    // Comparing integers using the extension function
    val extOutput: Boolean = x.checkGreater(y)
    if (extOutput) {
        println("x is greater!")
    } else println("y is greater!")

    // Using the infix notation to call the extension function
    val out: Boolean = x checkGreater y
    if (out) {
        println("x is greater!")
    } else println("y is greater!")
}
