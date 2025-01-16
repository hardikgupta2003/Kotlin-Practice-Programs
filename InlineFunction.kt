package com.example.kotlincodes


// using inline keyword, The function becomed inlined and execute on the call site instead of creating a object of a function type!
private inline fun someHOF(someLambda: (Int)->Unit){
    print("hello hardik this side!")
}
fun main(){
    someHOF {
        println(it)
    }

}