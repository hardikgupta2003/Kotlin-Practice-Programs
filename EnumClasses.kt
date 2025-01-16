package com.example.kotlincodes

enum class Modes(val clr : Int){
    DARK(1),LIGHT(2),DEVELOPMENT(3);



    fun containsDark() = (this.clr and 1 != 0)
}

fun main(){
    val d = Modes.DARK


    val ans = when(d){
        Modes.LIGHT -> "Light mode on krdiya hai"
        Modes.DARK -> "Dark mode on krdiya hai"
        Modes.DEVELOPMENT -> "Development mode on krdiya hai"
        else -> "Mode available nahi hai"
    }

    println(ans)

    println(d.containsDark())

    for(modes in Modes.entries){
        println(modes)
    }

    println(Modes.valueOf("DARK"))
    println(Modes.DEVELOPMENT.ordinal)
}