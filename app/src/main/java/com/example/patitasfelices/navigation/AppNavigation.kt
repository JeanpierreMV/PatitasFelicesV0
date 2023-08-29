package com.example.patitasfelices.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.patitasfelices.screens.FirstScreen
import com.example.patitasfelices.screens.SecondScreen


//gestiona la ruta de navegacion
@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = appScreens.FirstScreen.route ){
        composable(route = appScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = appScreens.SecondScreen.route){
            SecondScreen(navController)
        }


    }


