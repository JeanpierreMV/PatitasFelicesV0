package com.example.patitasfelices.screens.Inicio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.patitasfelices.R // Reemplaza esto con la ubicación de tu imagen de logo

@Composable
fun Inicio(navController: NavController) {


    var textoMascotas by remember { mutableStateOf("Mascotas") }
    var textoProductos by remember { mutableStateOf("Productos") }
    var textNoticias by remember { mutableStateOf("Noticias") }
    var textNostros by remember { mutableStateOf("Nosotros") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            //.background(Color(android.graphics.Color.parseColor("#EEEEEE")))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(0.2f))
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.fillMaxSize()
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.usua),
                contentDescription = "Icono",
                modifier = Modifier.size(36.dp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(7.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = textoMascotas,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp),
                fontSize = 15.5.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = textoProductos,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = textNoticias,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = textNostros,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(2.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(3) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    repeat(2) { index ->
                        val cardModifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(8.dp)

                        Card(
                            modifier = cardModifier
                                .clickable {
                                    // Agrega aquí la navegación a otra vista
                                }
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.perr1), // Reemplaza con la imagen que desees
                                    contentDescription = null, // Agrega una descripción adecuada
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(shape = MaterialTheme.shapes.medium),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Primera línea de texto",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp)
                                )

                                Text(
                                    text = "Segunda línea de texto",
                                    fontSize = 14.sp,
                                    modifier = Modifier.padding(horizontal = 8.dp)
                                )

                                Text(
                                    text = "Tercera línea de texto en negrita",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}