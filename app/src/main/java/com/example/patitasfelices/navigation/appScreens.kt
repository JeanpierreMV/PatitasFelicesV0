package com.example.patitasfelices.navigation

sealed class appScreens(val route: String){
    object  FirstScreen: appScreens("First_Screen")
    object  SecondScreen: appScreens("Second_Screen")
}
