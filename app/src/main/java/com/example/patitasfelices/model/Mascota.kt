package com.example.patitasfelices.model

data class Mascota(
    val id: String,
    val Nombre: String,
    val Tipo: String,
    val Raza: String,
    val Edad: Int
){
    constructor(): this("","","","",0)
}
