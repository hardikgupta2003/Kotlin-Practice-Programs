package com.example.kotlincodes

//open class Fruit
//
//class Apple : Fruit()

class FruitProducer<out T:Fruit>(val fruit : T){
    fun produce() : T {
        return fruit
    }
}

fun main(){
    val appleProducer : FruitProducer<Apple> = FruitProducer(Apple())
    val fruitProducer : FruitProducer<Fruit> = appleProducer


    println(fruitProducer.produce())

}