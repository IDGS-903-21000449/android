package com.example.introkotlin903._temasKotlin

fun main() {

    println("Programa para formula general")

    print("Ingresa el valor de a: ")
    val a = readln().toDouble()

    print("Ingresa el valor de b: ")
    val b = readln().toDouble()

    print("Ingresa el valor de c: ")
    val c = readln().toDouble()

    val dentroRaiz = b * b - 4 * a * c


        var raizCuadrada = 0.0

        raizCuadrada = dentroRaiz.toDouble()
        var i = 0
        while (i < 10) {
            raizCuadrada = (raizCuadrada + dentroRaiz / raizCuadrada) / 2
            i++
        }

        val x1 = (-b + raizCuadrada) / (2 * a)

        val x2 = (-b - raizCuadrada) / (2 * a)

        println("Las soluciones son:")
        println("x1 = $x1")
        println("x2 = $x2")
}