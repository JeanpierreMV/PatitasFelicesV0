package com.example.patitasfelices.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideFirestoreInstace()= FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideMascotaList(
        firestore: FirebaseFirestore
    ) = firestore.collection( "mascotas")

}