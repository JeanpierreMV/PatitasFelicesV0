package com.example.patitasfelices.screens.Inicio

import com.example.patitasfelices.model.Mascota

data class InicioState(
    val isloading: Boolean = false,
    val mascota: Mascota? =null,
    val error: String=""

    )
