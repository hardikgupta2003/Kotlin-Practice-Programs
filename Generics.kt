package com.example.kotlincodes

fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}
class Printin{
    fun <X> Greeting(List : List<X>) {
        for(el in List){
            println(el)
        }
    }

}

fun <T> DefDispaly (value : T?) : T?{
    return value ?: defaultValue(value)
}

fun <T> defaultValue(value : T) : T{

    return value.also { println("value null hai isiliye me aaya hu  -> $it ") }
}
fun main() {
    val intList = listOf(1, 2, 3)
    val stringList = listOf("a", "b", "c")
    val boolList = listOf(1.0,2.6,34,7.8)
//    printList(intList) // Output: 1, 2, 3
//    printList(stringList) // Output: a, b, c
//    printList(doubleList) // Output: a, b, c

    Printin().Greeting(boolList)

    DefDispaly(null).also(:: println)


}