package com.example.patitasfelices.screens

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch


class loginViewModel: ViewModel() {

        private val auth: FirebaseAuth = Firebase.auth
        private val _loading = MutableLiveData(false)


        fun signInWithEmailAndPassword(email : String,password:String, home: ()-> Unit )
        = viewModelScope.launch{
                try{
                        auth.signInWithEmailAndPassword(email, password)
                                .addOnCompleteListener { task->
                                        if(task.isSuccessful){
                                                Log.d("PatitasFelices","se ha logrado loguear")
                                                home()
                                        }else{
                                                Log.d("PatitasFelices","${task.result.toString()}")
                                                home()
                                        }

                                }

                }catch (ex:Exception){
                        Log.d("PatitasFelices","${ex.message}")
                }

        }

}