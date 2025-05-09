package com.example.introkotlin903._temasKotlin

fun main() {
    println("Programa de pirámide")

    var num: Int

    do {
        println("Ingrese el tamaño de la pirámide, si es 0 se acaba")
        num = readln().toInt()

        var fila = 1
        while (fila <= num) {
            var asteriscos = 1
            while (asteriscos <= fila) {
                print("*")
                asteriscos++
            }
            println()
            fila++
        }

    } while (num != 0)

    println("Programa finalizado.")
}

