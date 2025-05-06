package com.example.introkotlin903._temasKotlin


fun main(){

    println("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()

    if(sueldo > 3000){
        println("Debe pagar impuesto")
    }else{
        println("No debe pagar impuesto")
    }
}