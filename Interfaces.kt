package com.example.kotlincodes

interface Swimmable{
    val s : String

//    val s2 : String = "swimming" // not possible to hold states in the interfaces



    fun fn() // abstract function

    fun fn2(){
        println("hello from default implementaion of interface")
    }

    val fn2 : String
        get() = "hello with get function"
}


class Swim : Swimmable{
    override val s: String
        get() = "Hello from the class overriding"

    override fun fn() {
        println("Hello overriding completed of abstract function of interface")
    }
}
fun main(){
    val obj = Swim()
    obj.fn()
    println(obj.s)
    println(obj.fn2())

}