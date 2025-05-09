package com.example.introkotlin903._temasKotlin


fun main(){

    /*
    Range
    1..4 => 1,2,3,4
    1..<4 = 1,2,3
    4 downTo 1 = 4,3,2,1
    1..5 step 2 => 1,3,5
    'a'..'z' => a,b,c,d,e,f,gg......
    */

    for (num in 1..5) {
        println(num)
    }

    val frutas = listOf("Manzana","Pera","Frambuesa","Durazno")

    for(fruta in frutas){
        println(frutas)
    }

    val n = 10
    var d = 0
    while(d<n){
        println(d)
        d++
    }
}