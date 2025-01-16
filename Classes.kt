package com.example.kotlincodes

class Customer

class Contact(val id : Int,var email: String)

class initOrder(val name : String){
//    val od1 = "first property : $name".also (::println)

    init{
        println("first initializer block that prints : $name")
    }

    val od2 = "second property : ${name.length}".also (::println)

    init{
        println("second initializer block that prints : ${name.length}")
    }
    fun printing(){
        print("$name")
    }
}
fun main(){
    val cust = Customer()

    var contact = Contact(1,"hardik@gmail.com")

    println(contact.id)
    println(contact.email)


    contact.email = "hardikgupta@gmail.com"
    println(contact.email)



    val initObject = initOrder("Quality")
    println(initObject)

    initObject.printing()


}