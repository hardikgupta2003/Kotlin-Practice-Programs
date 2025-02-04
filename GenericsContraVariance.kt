package com.example.kotlincodes


open class Fruit

class Apple : Fruit()

class FruitConsumer<in T:Fruit>(val fruit :  @UnsafeVariance T){
    fun Consume() :  @UnsafeVariance T {
        return fruit
    }
}

fun main(){

    val fruitConsumer : FruitConsumer<Fruit> = FruitConsumer(Apple())
    val appleConsumer : FruitConsumer<Apple> =  fruitConsumer



    println(appleConsumer.Consume())

}