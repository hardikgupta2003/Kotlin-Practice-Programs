package com.example.kotlincodes


class Something{
    fun Dosomething(){
        println("Doing Something")
    }
}
fun main(){
    val obj = Something()
   val numbers =  mutableListOf("Hello","My","name","is","Hardik");

//    let
    val LetResult = numbers.map { it.length }.apply {
        numbers.add("Gupta")
    }
    with(obj){
        Dosomething()
    }
    println(LetResult)





}

