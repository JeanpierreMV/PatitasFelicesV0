package com.example.patitasfelices.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.patitasfelices.R
import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.patitasfelices.navigation.appScreens
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import com.example.patitasfelices.navigation.AppNavigation
import com.example.patitasfelices.ui.theme.PatitasFelicesTheme
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign


import androidx.compose.ui.text.style.TextDecoration
import com.example.patitasfelices.screens.registrar
import androidx.compose.ui.text.withStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable


@Composable
fun iniciarsesion(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#EEEEEE")))//#f0eddd
            .padding(top = 0.dp, bottom = 0.dp), // Agregar padding a la pantalla completa
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .padding(top = 0.dp, bottom = 0.dp) // Agregar padding al logo
                .size(width = 200.dp, height = 150.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(2.dp)) // Separación de 2dp

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .background(Color(android.graphics.Color.parseColor("#FFFBFB")))
                .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                .padding(50.dp, 0.dp, 50.dp, 50.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 0.dp)
            ) {
                Text(
                    text = "Iniciar Sesión",
                    fontSize = 34.5.sp,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {


                    var emailText by rememberSaveable { mutableStateOf("") }
                    OutlinedTextField(value = emailText, onValueChange = { emailText = it }, label = { Text("Correo Electrónico") }, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))

                    var passwordText by rememberSaveable { mutableStateOf("") }
                    OutlinedTextField(value = passwordText, onValueChange = { passwordText = it }, label = { Text("Contraseña") }, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))
                }
                Button(
                    onClick = {
                        navController.navigate(route = appScreens.Inicio.route)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text("Iniciar Sesión", color = Color.White)
                }
                Text(
                    text = buildAnnotatedString {
                        append("¿No tienes una cuenta? ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Blue,
                                textDecoration = TextDecoration.Underline
                            )
                        ) {
                            append("Create Now")
                        }
                    },
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 8.dp)
                        .clickable {
                            navController.navigate(route = appScreens.registrar.route)
                        }
                )
                Text(
                    text = "¿Olvidaste la contraseña?",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fac),
                        contentDescription = "Image 1",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(4.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.gogg),
                        contentDescription = "Image 2",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(4.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ins),
                        contentDescription = "Image 3",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(4.dp)
                    )
                }
            }
        }
    }
}