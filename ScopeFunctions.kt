package com.example.kotlincodes

// A simple class with a function
class Something{
    fun DoSomething(){
        println("Doing Something")
    }
}

fun main(){
    val obj = Something()
    val numbers = mutableListOf("Hello", "My", "name", "is", "Hardik")

    // Using 'let': Executes the block and returns the result
    val letResult = numbers.let { it ->
        it.map { it.length }.apply {
            numbers.add("Gupta") // Modifying the list inside 'apply'
        }
    }

    // Using 'with': Executes code within the context of the object
    with(obj){
        DoSomething()
    }

    println(letResult)

    // Using 'run': Executes the block and returns the result
    val runResult = obj.run {
        DoSomething()
        "Run completed"
    }
    println(runResult)

    // Using 'apply': Modifies an object and returns it
    val applyResult = numbers.apply {
        add("Kotlin")
    }
    println(applyResult)

    // Using 'also': Allows additional operations while returning the same object
    val alsoResult = numbers.also {
        println("List before modification: $it")
        it.add("Programming")
    }
    println("List after modification: $alsoResult")
}
