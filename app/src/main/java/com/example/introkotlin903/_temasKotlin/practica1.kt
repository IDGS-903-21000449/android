package com.example.introkotlin903._temasKotlin

fun main() {


        println("Seleccione su operacion: \n")
        println("1- Suma")
        println("2- Resta")
        println("3- Multiplicacion")
        println("4- Division")
        println("5- Salir")
        val opc = readln().toInt()

    do {
        if (opc == 1) {
            println("Ponga el primer numero")
            val num1 = readln().toDouble()
            println("Ponga el segundo numero")
            val num2 = readln().toDouble()

            var res = num1 + num2

            println("La suma de $num1 + $num2 es igual a $res")
        }
        if (opc == 2) {

            println("Ponga el primer numero")
            val num1 = readln().toDouble()
            println("Ponga el segundo numero")
            val num2 = readln().toDouble()

            var res = num1 - num2

            println("La resta de $num1 + $num2 es igual a $res")
        }
        if (opc == 3) {

            println("Ponga el primer numero")
            val num1 = readln().toDouble()
            println("Ponga el segundo numero")
            val num2 = readln().toDouble()

            var res = num1 * num2

            println("La multiplicacion de $num1 + $num2 es igual a $res")
        }
        if (opc == 4) {

            println("Ponga el primer numero")
            val num1 = readln().toDouble()
            println("Ponga el segundo numero")
            val num2 = readln().toDouble()

            var res = num1 / num2

            println("La division de $num1 + $num2 es igual a $res")
        }
    }while(opc == 5)

}