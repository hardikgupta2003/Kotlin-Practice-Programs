package com.example.kotlincodes

// since we inlined the function, so all the lamda functions in the params are inlined by defult
inline fun someHigherOF(someLambda : (String)->Unit, noinline heavyHandedLamda : ()->Unit){
    someLambda("Hello").also { println("somelamda is running") }
    heavyHandedLamda()
}



fun main(){
    someHigherOF(
        someLambda = {},
        heavyHandedLamda = {
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
            println("heavy ended lamda is called")
        }
    )
}