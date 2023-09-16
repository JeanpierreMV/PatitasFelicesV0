package com.example.patitasfelices

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


object DatabaseConnector {

    private const val url = "jdbc:postgresql://dpg-ck272ifqj8ts73f8j86g-a.oregon-postgres.render.com:5432/patitasfelices"
    private const val user = "patitasfelices_user"
    private const val password = "f4ZweojKYoeRCVs9GRhp1iLLeKuahUDc"

    @JvmStatic
    fun connect(): Connection? {
        var conn: Connection? = null
        try {
            conn = DriverManager.getConnection(url, user, password)
            println("Connected to the PostgreSQL server successfully.")
        } catch (e: SQLException) {
            println(e.message)
        }
        return conn
    }
}

