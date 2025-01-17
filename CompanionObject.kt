package com.example.kotlincodes

class Myclass{

    companion object hello {
        fun draw() {
            println("can Draw")
        }

        val greet: String = "Namaste!!"
    }
}
fun main(){
    val obj = Myclass()
    Myclass.draw()
    println(Myclass.greet)
}