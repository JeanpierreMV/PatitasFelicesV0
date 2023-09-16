package com.example.patitasfelices.navigation

import android.annotation.SuppressLint
import androidx.compose.material.DrawerValue
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.patitasfelices.screens.Inicio.Inicio
import com.example.patitasfelices.screens.iniciarsesion
import com.example.patitasfelices.screens.registrar
import com.example.patitasfelices.component.Sidebar


//gestiona la ruta de navegacion



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val showSidebar = navController.currentDestination?.route !in listOf(
        appScreens.iniciarsesion.route,
        appScreens.registrar.route
    )
    // Muestra el sidebar solo si showSidebar es true
    if (showSidebar) {
        Sidebar()
    }


    NavHost(navController = navController, startDestination = appScreens.iniciarsesion.route) {
        composable(route = appScreens.iniciarsesion.route) {
            iniciarsesion(navController)
        }
        composable(route = appScreens.registrar.route) {
            registrar(navController)
        }

        composable(route = appScreens.Inicio.route) {

            Inicio(navController)
        }
    }
}




