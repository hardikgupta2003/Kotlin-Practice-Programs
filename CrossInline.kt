package com.example.kotlincodes

//inline fun ABC(lamdaI : (String) -> Unit){
//    XYZ{
//        lamdaI("")  // LamdaI is not allowed here because we are accessing the lamda of inlined function in noninline's lamda scope
//    }
//}


inline fun ABC(crossinline lamdaI : (String) -> Unit){
    lamdaI("")
    XYZ{
        lamdaI("") // now using crossinline keyword , now we can access the lamda of inlined function in noninline's lamda scope
    }
}


fun XYZ(LamdaNI : (String) -> Unit){
    LamdaNI("")
}
fun main(){

}