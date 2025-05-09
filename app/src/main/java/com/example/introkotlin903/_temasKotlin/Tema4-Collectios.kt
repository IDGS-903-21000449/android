package com.example.introkotlin903._temasKotlin

fun main(){

    /*
    List
    MutableList
    Set
    MutableSet
    Map
    MutableMap
     */

    var lista = listOf<String>("Lunes", "Martes", "Miercoles")
    println(lista)
    println(lista.size)
    println(lista[0])
    println(lista[1])
    println(lista.indexOf("Miercoles"))
    println(lista.first())
    println(lista.last())


    var listamutable = mutableListOf<String>("Lunes", "Martes", "Miercoles")

    println(listamutable)
    listamutable.removeAt(0)
    println(listamutable)
    listamutable.add("Domingo")
    println(listamutable)
    listamutable.remove("Miercoles")
}