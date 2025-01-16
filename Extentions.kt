package com.example.kotlincodes

fun String.concat(s2:String,s3:String) : String{
    return this + s2 + s3
}

infix fun Int.checkGreater(other : Int): Boolean{
    return if (this > other) return true else false
}
fun main(){
    val s1 = "Hardik "
    val s2 = "Gupta "
    val s3 = "Here!"

    val name = s1 + s2 + s3
    println("Printing name using without extention function : "+name)

    val extName = s1.concat(s2,s3)
    println("Printing name using Extention function : "+extName)


//    with the integer
    val x = 20
    val y = 25

//    without extention function
    val output = if(x>y) println("x is greater!") else println("y is greater!")

//    with extention function
    val extOutput : Boolean = x.checkGreater(y)
    if (extOutput){
        println("x is greater!")
    }else println("y is greater!")

    // since it is extention function , so we can call the function using infix notation
    val out : Boolean = x checkGreater y
    if (out){
        println("x is greater!")
    }else println("y is greater!")
}