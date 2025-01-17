package com.example.kotlincodes

import com.example.kotlincodes.ABCD.MNO


sealed class ABCD{
    class MNO : ABCD(){
        fun tx(a:Int){
            println("printing tx")
        }
    }

    companion object{
        init {
            println("companion object")
        }
    }

}

fun MNO.ui(a:Int){
    println("printing UI")
}
fun main(){
    val mno = ABCD.MNO()
    mno.tx(2)
    mno.ui(5)




}