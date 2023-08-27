package com.example.patitasfelices

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object DatabaseHelper {
    private var connection: Connection? = null

    fun connectToDatabase(): Connection? {
        return try {
            // Reemplaza los valores con los detalles de tu base de datos
            val url = "jdbc:mysql://root:3Q3DW8kuwpauX9mvNq72@containers-us-west-177.railway.app:6251/railway"
            val username = "root"
            val password = "3Q3DW8kuwpauX9mvNq72"
            val connection: Connection = DriverManager.getConnection(url, username, password)
            connection // Devuelve la conexión establecida

        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }
}