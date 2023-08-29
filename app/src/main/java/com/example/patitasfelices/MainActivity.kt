package com.example.patitasfelices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.patitasfelices.ui.theme.PatitasFelicesTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.sql.ResultSet


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PatitasFelicesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val viewModel: MyViewModel = viewModel()

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        val userState = viewModel.getUserInfo()

        if (userState.value != null) {
            val userInfo = userState.value!! // Accede al valor del State
            Text(text = "Nombre: ${userInfo.nombre}")
            Text(text = "Apellido: ${userInfo.apellido}")
            Text(text = "Correo: ${userInfo.correo}")
            Text(text = "Rol: ${userInfo.rol}")
        } else {
            Text(text = "No se pudo obtener la información del usuario")
        }
    }
}

data class UserInfo(
    val nombre: String,
    val apellido: String,
    val correo: String,
    val rol: String
)

class MyViewModel : ViewModel() {
    fun getUserInfo(): State<UserInfo?> {
        val userState = mutableStateOf<UserInfo?>(null)
        viewModelScope.launch {
            val connection = DatabaseHelper.connectToDatabase()
            if (connection != null) {
                withContext(Dispatchers.IO) {
                    val resultSet = connection.createStatement().executeQuery("SELECT * FROM usuario")
                    if (resultSet.next()) {
                        val nombre = resultSet.getString("nombre")
                        val apellido = resultSet.getString("apellido")
                        val correo = resultSet.getString("correo")
                        val rol = resultSet.getString("rol")
                        connection.close()
                        userState.value = UserInfo(nombre, apellido, correo, rol)
                    }
                    connection.close()
                }
            }
        }
        return userState
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    PatitasFelicesTheme {
        MyApp()
    }
}
