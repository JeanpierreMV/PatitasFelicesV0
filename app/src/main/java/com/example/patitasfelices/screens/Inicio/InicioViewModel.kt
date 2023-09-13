package com.example.patitasfelices.screens.Inicio

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.patitasfelices.model.Mascota
import com.example.patitasfelices.repositorio.mascotaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class InicioViewModel
@Inject
constructor(
    private val mascotaRepository: mascotaRepository
): ViewModel(){

    private val _state:MutableState<InicioState> = mutableStateOf(InicioState())
    val state: State<InicioState>
        get() = _state
    fun addMascota(Nombre: String,Tipo: String,Raza: String,Edad: Int){

        val mascota = Mascota(
            id = UUID.randomUUID().toString(),
            Nombre = Nombre,
            Tipo = Tipo,
            Raza =Raza,
            Edad=Edad
        )
        mascotaRepository.addnewMascota(mascota)

    }
}