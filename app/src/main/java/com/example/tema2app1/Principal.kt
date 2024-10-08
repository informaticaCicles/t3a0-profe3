package com.example.tema2app1

fun main() {
    mostrarSou()
   var nouSou = canviarSou(1500f, 200f)
    println("El sou actual es $nouSou")
    println("El sou actual es ${canviarSou(1500f,400f)}")


}
fun mostrarSou(){
    var sou = 1500
    println("El teu sou es: $sou")
}

fun canviarSou(souActual: Float, increment: Float = 200f):Float{
    return souActual + increment
}