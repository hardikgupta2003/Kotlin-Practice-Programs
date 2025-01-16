package com.example.kotlincodes

open class Person(val name: String){
    open fun work(){
        println("Person work called")
    }
}

// outer class
class Student(name:String) :Person(name=name){
    override fun work(){
//        super.work()
        val stu12 = Student12(name)
        stu12.studyAndPlay()
        println("Student work called");
    }
// inner class
    inner class Student12(name:String){
        private fun study(){
            println("I have to study")
        }

        fun studyAndPlay(){
            super@Student.work();
            println("calling function of superclass of the outer class !!")
            study()
        }
    }
}

fun main() {
    val student = Student("Hardik");
    student.work()

}