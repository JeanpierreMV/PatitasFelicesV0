package com.example.patitasfelices

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


object DatabaseHelper {
    private var connection: Connection? = null

    fun connectToDatabase(): Connection? {
        return try {
            // Reemplaza los valores con los detalles de tu base de datos

            connection = DriverManager.getConnection( "jdbc:mysql://root:3Q3DW8kuwpauX9mvNq72@containers-us-west-177.railway.app:6251/railway", "root","3Q3DW8kuwpauX9mvNq72")
            connection

        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }
}