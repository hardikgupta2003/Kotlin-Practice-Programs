package com.example.kotlincodes

import android.util.Log

//Func with return type Unit (no return value)
fun printMsg(Msg : String) : Unit{
    println("$Msg")
}

//func with default arguments and no return type
fun printMsgPrefix(Msg : String , Prefix : String){
    println("$Prefix - $Msg")
}

//fun that return Int value
fun calculate(a :Int,b:Int):Int{
    return a+b
}
// single line expression function
fun cal(a:Int,b:Int) = a*b


fun learn(topic:String =  "Maths",hour:Int){
    println("$topic , hours studied : $hour")
}

// varargs
fun varArgsFun(vararg vararg: String){
        for(i in vararg){
            println(i)
        }

}

fun myMain(vararg args: Any) {
    println("printing Args of input : ")
    args.forEach {
        println("$it")
    }
}

fun double(x:Int) : Int = x*2
fun main(){


    printMsg("Hardik")
    printMsgPrefix("Hardik","Mr.")
    println(calculate(12,12))
    println(cal(12,23))

//    learn("kotlin",5)
    learn(hour = 4, topic = "Kotlin")

    println(double(5))
    val list : List<String> = listOf("Hardik","Gupta","Digivalet")
    val arr : Array<String>  = arrayOf("Hardik","Gupta","Digivalet")



    varArgsFun("Hardik","Gupta","Digivalet")

//    myMain("Hardik")
//    myMain( 23763)
//    myMain( 0.4f)
//    myMain( 0.4f)
//    myMain("Hardik",3423, 0.4f)
}

