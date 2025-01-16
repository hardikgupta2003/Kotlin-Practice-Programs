package com.example.kotlincodes



//taking functions as a parameters

fun Calculate(x:Int,y:Int,operation : (Int,Int) -> Int) : Int{
    return operation(x,y)
}
fun sumation(x:Int,y:Int) = x+y

//taking functions which are returning functions
fun operation(): (Int) -> Int{
    return ::square
}

fun square(x:Int) = x * x

fun main(){
    val a : Int = Calculate(5,4,::sumation)
    val b : Int = Calculate(5,6,{a,b -> a*b})
    println(b)

    val func = operation()
    println(func(5))
}