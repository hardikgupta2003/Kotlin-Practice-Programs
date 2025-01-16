package com.example.kotlincodes

interface Building{
    fun doing(){
        println("Building")
    }
}

interface Hospital{
    fun doing(){
        println("Hospital")
    }
}

open class Mall{
    open fun doing(){
        println("Mall")
    }
}

class Player : Hospital,Building,Mall(){
    override fun doing(){
        super<Mall>.doing()
        super<Hospital>.doing()
        super<Building>.doing()
        println("Player")
    }
}

fun main(){
    val p = Player()
    p.doing()
}