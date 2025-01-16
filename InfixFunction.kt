package com.example.kotlincodes

class Math(){
    infix fun square(x:Int):Int{
        return x*x
    }
}


fun main(){
    // standard library infix function
    var b = 100 shl 2
    b = 100.shl(2)
    println(b)

    // user defined infix function
    val m = Math()

    println(m square 4).also{ println("call using infix") } // call using infix notation
    println(m.square(4)).also{ println("non infix") } // call using dot and parenthesis
    println(Pair("hello","world"))



}