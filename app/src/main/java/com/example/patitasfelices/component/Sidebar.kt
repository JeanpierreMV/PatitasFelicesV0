package com.example.patitasfelices.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.patitasfelices.R
import kotlinx.coroutines.launch

@Composable
fun Sidebar() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val items = listOf(Icons.Default.Favorite, Icons.Default.Face, Icons.Default.Email)
    val selectedItem = remember { mutableStateOf(items[0]) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        modifier = Modifier.fillMaxWidth(0.65f).zIndex(if (drawerState.isClosed) 0f else 1f),
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = Color.Black.copy(alpha = 0.4f)
            ) {
                // Aquí colocamos tu logo centrado en la parte superior y ajustamos su tamaño
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // Reemplaza "tu_logo" con la imagen de tu logo y ajusta el tamaño
                    Image(
                        painter = painterResource(id = R.drawable.logo2),
                        contentDescription = null,
                        modifier = Modifier.size(200.dp).align(Alignment.Center)
                    )
                }

                Spacer(Modifier.height(12.dp))
                items.forEach { item ->
                    NavigationDrawerItem(
                        icon = { Icon(item, contentDescription = null) },
                        label = { Text(item.name) },
                        selected = item == selectedItem.value,
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem.value = item
                        },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        content = {
            // Resto del contenido del Sidebar
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(8.dp)
                ) {
                    IconButton(
                        onClick = { scope.launch { drawerState.open() } }
                    ) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                    }
                }

                // Aquí puedes agregar el resto de tus elementos de contenido
            }
        }
    )
}