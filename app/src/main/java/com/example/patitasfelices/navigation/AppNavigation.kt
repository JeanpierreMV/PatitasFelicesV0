package com.example.patitasfelices.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.Icon
import androidx.compose.material.ModalDrawer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.patitasfelices.screens.Inicio.Inicio
import com.example.patitasfelices.screens.iniciarsesion
import com.example.patitasfelices.screens.registrar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.patitasfelices.component.Sidebar
import kotlinx.coroutines.launch


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




