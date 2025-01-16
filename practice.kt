package com.example.kotlincodes

fun solve(str: String,input : String) : Boolean{

    var i = 0
    var j = 0

    while (i<str.length && j < input.length) {
        if (str[i] == input[j]) {
            if(i!=str.length-1 && j != input.length-1 && str[i+1] != input[j+1]){
                j=0
                continue
            }
            j++
        }
        i++
    }

    return j == input.length

}
fun main(){
    val str = "abcdxycde"

    println( solve(str,"cd"))


}


