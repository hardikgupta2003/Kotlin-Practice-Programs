package com.example.kotlincodes

// Private function: Only accessible within this file
private fun go(){
    println("Go function is calling!")
}

// Public variable with a private setter (can only be modified within this file)
public var a : Int = 5
    private set

// Internal variable: Accessible within the same module
internal val x : Int = 10

// Open class can be inherited
open class Outer{

    private var e = 1 // Private: Only accessible within this class
    public var b = 2 // Public: Accessible from anywhere
    protected open var c = 3 // Protected: Accessible within this class and subclasses
    internal open var d = 4 // Internal: Accessible within the same module

    // Private function: Only accessible within this class
    private fun pluss(a : Int, b: Int) : Int = a + b

    val I = Inner().f // Accessing the public member of the nested class

    // val IO = Inner().g // Outer class cannot see the private members of the nested class

    // Protected nested class: Only accessible within this class and subclasses
    protected class Inner{
        public val f = 5 // Public: Accessible within subclasses
        private val g = 78 // Private: Not accessible outside this class
    }
}

// Subclass inheriting from Outer
class Subclass : Outer(){
    override var c = 90 // Protected by default
    override var d = 80 // Internal by default

    val IP : Int = Inner().f // Accessing the public member of Inner class
}

fun main(){
    go(); // Calling the private function

    val o = Outer();
    println(o.I) // Accessing the public member of Inner class

    // val i = Outer.Inner // Not visible because Inner is protected

    val SC = Subclass().IP.also { println("Calling after accessing from the protected nested class: "+it) }
}
