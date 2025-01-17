package com.example.kotlincodes

fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

fun main() {
    val intList = listOf(1, 2, 3)
    val stringList = listOf("a", "b", "c")
    val boolList = listOf(1.0,2.6,34,7.8)
    printList(intList) // Output: 1, 2, 3
    printList(stringList) // Output: a, b, c
    printList(boolList) // Output: a, b, c
}