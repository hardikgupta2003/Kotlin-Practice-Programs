package com.example.kotlincodes

fun strLength(notNull : String?) : Any{
    if(notNull != null && notNull.length > 0){
        return "String length : ${notNull.length}"
    }
    else{
        return println("string is null")
    }
}
fun main(){
    var safe = null
    println(safe)
    var a : Int = 12
//    println(a)

    var str : String = "this can't be null"
//    str = null (we can't define a non-nullable variable as a null)

    var str2 : String? = "this can be null"
    // this can be null because we defined the str2 is nullable
    str2 = null

//    println(str2)

    var str3 = "This is inferred non null"
//    str3 = null (this can not be null because by inferring variable is non-null by default)

    println(strLength(str))

//    println(strLength(str2))      compilation error -> string argument is not nullable
//    (if we put '?' after notNull type, then we can do it)

//    handled the nulls

    println(strLength(str2))



    val str4 = null
    if(str2 === str4){
        println("true")
    }else println("false")
}

