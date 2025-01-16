package com.example.kotlincodes


// avoid using open members in constructor kyuki vo override ho jayegi inside the derived class aur derived class ke object se access ke time
open class Base(val name:String?){
    init {

        println("Base class ka constructor call hua hai!!!")
    }

    val len = name?.length ?: 0
    open fun printing() : Int{
        println("hello : $name")
        return name?.length ?: 0
    }

}

class Derived(name: String, val age: Int) : Base(name = name.replaceFirstChar { x-> x.uppercase() }
    .also { println("Base class ke arguments evaluate hogye!!") }) {

    init {
        println("Derived class ka constructor call hua hai!!!")
    }

    override fun printing(): Int {
        println("hello : $name - age : $age")
        return (name?.length ?: 0) + age
    }
}

fun main(){
    val derived = Derived("Hardik",21)
//    println(derived.len)
    derived.printing()



}