package com.example.kotlincodes

import androidx.resourceinspection.annotation.Attribute


// Kotlin classes are final - they cant be inherited
//but to make it inheriter , we have to mark it with open keyword

//all the classes have common and default superclass which is "Any"

open class Human(val name : String,age: Int = 21){


    init {
        println("name : $name , age : $age");
    }
    open fun work(){
        println("Human can work")
    }
}
//// when derived class has primary constructors
//class Employee(name:String, age:Int) : Human(name,age){
//    override fun work(){
//        println("Employee can work")
//    }
//}

//when derived class has not primary constructors
//class Employee:Human{
//    constructor(name:String,age: Int) : super(name,age)
//    override fun work(){
//        println("Human can work")
//    }
//}

//class Employee:Human{
//    constructor(name:String) : super(name,age=21)
//    override fun work(){
//        println("Human can work")
//    }
//}

class Employee:Human{
    constructor(name: String) : super(name)
    constructor(name:String,age: Int) : super(name,age)
    override fun work(){
        println("Human can work")
    }
}


open class Shape() {
    var vertexCount: Int = 0
    open fun draw(shapeName : String = "Polygon",vertex:Int){
        println("$shapeName")
    }
}

class Rectangle : Shape() {
    override fun draw(ShapeName: String,vertex: Int) { // ShapeName : String = "Polygon" default parameteres are not allowed in override functions
//        super.draw("Circle", vertex = 0) // super calls with default arguments are not allowed
        println("$ShapeName")
        vertexCount = 4
    }
}

class Circle : Shape(){
    fun drawing(ShapeName : String="Circle",Vertex :Int,funn : () -> Unit){
        print("fun with func as a params")
    }
}


fun main(){
//    val emp = Employee("Hardik",21)
//    emp.work()

//    val emp = Employee("Hardik")
//    emp.work()

    val sh = Circle()
    sh.drawing("circle",5, funn = { println("func as a params") })
//    print(sh.vertexCount)


}