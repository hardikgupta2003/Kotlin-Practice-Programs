package com.example.kotlincodes

// Data class representing a user with a name and an ID
data class User(val name: String, val id: Int) {
    // Overriding equals to compare users based only on their ID
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user) // Printing user object

    val secondUser = User("Alex", 1) // Creating a user with same ID
    val thirdUser = User("Max", 2) // Creating a user with a different ID

    // Comparing users using overridden equals method
    println("user == secondUser: \${user == secondUser}")
    println("user == thirdUser: \${user == thirdUser}")

    // hashCode() function demonstration
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function demonstration
    println(user.copy()) // Copying the user object
    println(user === user.copy()) // Checking reference equality
    println(user.copy("Max")) // Copying and changing the name
    println(user.copy(id = 42)) // Copying and changing the ID

    // Using component functions to extract properties
    println("name = \${user.component1()}")
    println("id = \${user.component2()}")
}
