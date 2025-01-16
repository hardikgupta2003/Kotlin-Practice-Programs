package com.example.kotlincodes

interface Name{
    val name : String
}

interface Surname{
    val surname : String
}

interface FullName : Name, Surname{
    override val name: String
        get() = "Hardik"
}

interface Age{
    val age : Int
}

class Hardikperson: FullName,Age{
    override val surname: String
        get() = "Gupta"

    override val age: Int
        get() = 21
}
fun main(){
    val obj = Hardikperson()
    println("${obj.name}-${obj.surname},age : ${obj.age}")

}