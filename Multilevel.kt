package com.example.kotlincodes

open class ABC(name : String){
    open val prop = "name : $name".also(::println)
}

open class PQR(name:String,age:Int) : ABC(name){
//    override val prop = "name : $name - age : $age".also(::println)
}
class XYZ (name:String,age:Int,role:String):PQR(name,age){
//    override val prop = "name : $name - age :$age - role : $role".also(::println)
}

fun main(){
    val xyz = XYZ("Hardik",21,"Admin")
    xyz.prop

}