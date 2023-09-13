package com.example.patitasfelices.repositorio

import com.example.patitasfelices.model.Mascota
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class mascotaRepository
@Inject
constructor(
   private val mascotaList: CollectionReference
){
    fun addnewMascota(mascota: Mascota){

        try{
            mascotaList.document(mascota.id).set(mascota)

        }catch (e:Exception){
            e.printStackTrace()
        }

    }

}