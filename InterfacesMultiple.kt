package com.example.kotlincodes

// Define an interface called Name with a property 'name'
interface Name {
    val name: String
}

// Define an interface called Surname with a property 'surname'
interface Surname {
    val surname: String
}

// Define an interface called FullName that extends both Name and Surname
interface FullName : Name, Surname {
    // Override the 'name' property in FullName interface with a default value "Hardik"
    override val name: String
        get() = "Hardik"
}

// Define an interface called Age with a property 'age'
interface Age {
    val age: Int
}

// Define a class Hardikperson that implements FullName and Age interfaces
class Hardikperson : FullName, Age {
    // Override the 'surname' property from Surname interface with "Gupta"
    override val surname: String
        get() = "Gupta"

    // Override the 'age' property from Age interface with 21
    override val age: Int
        get() = 21
}

fun main() {
    // Create an instance of Hardikperson
    val obj = Hardikperson()
    // Print the formatted string with the properties from the object
    println("${obj.name}-${obj.surname}, age: ${obj.age}")
}
