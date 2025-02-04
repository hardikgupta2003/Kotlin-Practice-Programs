package com.example.kotlincodes

// Function to check if 'input' is a subsequence of 'str'
fun solve(str: String, input: String): Boolean {
    var i = 0 // Pointer for 'str'
    var j = 0 // Pointer for 'input'

    while (i < str.length && j < input.length) {
        if (str[i] == input[j]) {
            if (i != str.length - 1 && j != input.length - 1 && str[i + 1] != input[j + 1]) {
                j = 0 // Reset 'j' if next characters don't match
            }
            j++ // Move pointer for 'input'
        }
        println("i -> $i, j -> $j") // Debugging output
        i++ // Move pointer for 'str'
    }

    return j == input.length // Return true if entire 'input' is found
}

fun main() {
    val str = "abcdxycde"
    println(solve(str, "ci")) // Test case
}
