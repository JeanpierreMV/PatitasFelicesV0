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
        val connectionState by produceState(initialValue = "Desconectado") {
            val connection = viewModel.connectToDatabase()
            value = if (connection != null) {
                connection.close() // Cierra la conexión después de conectarse
                "Conectado"
            } else {
                "Desconectado"
            }
        }

        Text(text = "Estado de la conexión: $connectionState")
    }
}

class MyViewModel : ViewModel() {
    fun connectToDatabase(): Connection? {
        return DatabaseHelper.connectToDatabase()
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    PatitasFelicesTheme {
        MyApp()
    }
}
