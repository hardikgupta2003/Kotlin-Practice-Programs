package com.example.kotlincodes

// Base class representing a generic fruit
open class Fruit

// Subclass representing an Apple, which is a type of Fruit
class Apple : Fruit()

// Class using contravariance (in) to consume Fruit or its subtypes
class FruitConsumer<in T: Fruit>(val fruit: @UnsafeVariance T) {
    // Function to return the consumed fruit
    fun Consume(): @UnsafeVariance T {
        return fruit
    }
}

fun main() {
    // Creating a FruitConsumer that accepts any Fruit, initialized with an Apple
    val fruitConsumer: FruitConsumer<Fruit> = FruitConsumer(Apple())

    // Assigning a FruitConsumer<Fruit> to a FruitConsumer<Apple> due to contravariance
    val appleConsumer: FruitConsumer<Apple> = fruitConsumer

    // Consuming and printing the fruit
    println(appleConsumer.Consume())
}
