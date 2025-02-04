package com.example.kotlincodes

// Define an open class Person, which means other classes can inherit from it
open class Person(val name: String) {
    // The work() function prints a message when called
    open fun work() {
        println("Person work called")
    }
}

// Outer class that inherits from Person
class Student(name: String) : Person(name = name) {
    // Override the work() method to change its behavior for Student class
    override fun work() {
        // Create an instance of the inner class Student12
        val stu12 = Student12(name)
        // Call the studyAndPlay() function of the inner class
        stu12.studyAndPlay()
        println("Student work called")
    }

    // Inner class Student12
    inner class Student12(name: String) {
        // Private function that prints a message (only accessible within the inner class)
        private fun study() {
            println("I have to study")
        }

        // Public function that calls the work() function of the outer class
        fun studyAndPlay() {
            // Access the work() method from the outer class (Student)
            super@Student.work()
            // Print a message after calling the super function
            println("calling function of superclass of the outer class !!")
            // Call the study() method from this inner class
            study()
        }
    }
}

fun main() {
    // Create an instance of the Student class with the name "Hardik"
    val student = Student("Hardik")
    // Call the work() method of the Student class, which triggers inner class logic
    student.work()
}
