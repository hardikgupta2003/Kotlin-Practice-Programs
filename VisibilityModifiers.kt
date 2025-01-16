package com.example.kotlincodes

private fun go(){
    println("Go function is calling!")
}

public var a : Int = 5
    private set


internal val x : Int = 10




open class Outer{

    private var e = 1
    public var b = 2
    protected open var c = 3
    internal open var d = 4

    private fun pluss(a : Int,b:Int) : Int = a+b


    val I = Inner().f

//    val IO = Inner().g // outer class can not see the private members of nested class

     protected class Inner{
        public val f = 5
         private val g = 78

    }

}

class Subclass : Outer(){
    override var c = 90 // bydefault protected
    override var d = 80 // bydefault internal

    val IP : Int = Inner().f

}
fun main(){
    go();

    val o = Outer();
    println(o.I)
//    val i = Outer.Inner // not visible

    val SC = Subclass().IP.also { println("calling after accessing from the protected nested class : "+it) }

}