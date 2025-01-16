package com.example.kotlincodes

abstract class Work{
    abstract fun walk()

    abstract fun talk()
}

class WorkType : Work(){
    override fun walk() {
        println("Walk")
    }

    override fun talk() {
        println("Talk")
    }


}

fun main(){
    val obj = WorkType()
    obj.talk()
}