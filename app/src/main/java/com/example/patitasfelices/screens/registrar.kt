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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import com.example.patitasfelices.navigation.AppNavigation
import com.example.patitasfelices.ui.theme.PatitasFelicesTheme


@Composable
fun registrar(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#EEEEEE")))
            .padding(top = 0.dp, bottom = 0.dp), // Agregar padding a la pantalla completa
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .padding(top = 0.dp, bottom = 0.dp) // Agregar padding al logo
                .size(width = 150.dp, height = 100.dp),
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
                    text = "REGISTRAR",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    Text("Nombres", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("Apellidos", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("Tipo de Documento", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("N° de Documento", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("N° de Celular", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("Correo Electronico", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                    Text("Contraseña", modifier = Modifier.padding(bottom = 4.dp))
                    BasicTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                            .background(Color(android.graphics.Color.parseColor("#D9D9D9")))
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)

                ) {
                    Text("Registrar", color = Color.White)
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(48.dp)
                        .background(MaterialTheme.colorScheme.primary, shape = CircleShape)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.flecha),
                        contentDescription = "Flecha izquierda",
                        tint = Color.White
                    )
                }


//                Spacer(modifier = Modifier.height(30.dp))
//                Row(
//                    horizontalArrangement = Arrangement.Center,
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.fac),
//                        contentDescription = "Image 1",
//                        modifier = Modifier
//                            .size(40.dp)
//                            .padding(4.dp)
//                    )
//                    Image(
//                        painter = painterResource(id = R.drawable.gogg),
//                        contentDescription = "Image 2",
//                        modifier = Modifier
//                            .size(40.dp)
//                            .padding(4.dp)
//                    )
//                    Image(
//                        painter = painterResource(id = R.drawable.ins),
//                        contentDescription = "Image 3",
//                        modifier = Modifier
//                            .size(40.dp)
//                            .padding(4.dp)
//                    )
//                }
            }
        }
    }
}
