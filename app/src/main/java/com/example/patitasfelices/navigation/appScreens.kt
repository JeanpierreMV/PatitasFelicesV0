package com.example.patitasfelices.navigation

sealed class appScreens(val route: String){
    object  iniciarsesion: appScreens("iniciarsesion")
    object  registrar: appScreens("registrar")
    object  Inicio: appScreens("Inicio")
}
