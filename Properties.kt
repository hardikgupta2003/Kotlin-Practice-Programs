package com.example.kotlincodes

class vehicle{


    var name: String = "Lord Omni"
    var brand : String = "Maruti"
    var year : Int = 2000
    fun CarAccess() : String{
        val car1 = vehicle()
        return "car name : ${car1.name} , brand : ${car1.brand} ,year : ${car1.year}"
    }


}

class Car{
    val car1 = vehicle()
    var carName = "car name : ${car1.name} , brand : ${car1.brand} ,year : ${car1.year}".also( ::println )

}
 class calculation(var x:Int){
    val area : Int
        get() = (this.x * this.x).also { println("custom getter called") }

}
fun main(){



    val car = Car()
//    car.carName

    val v = vehicle()
    v.CarAccess()

    val vari = vehicle()

    val cal = calculation(5)
    println(cal.area)

}


