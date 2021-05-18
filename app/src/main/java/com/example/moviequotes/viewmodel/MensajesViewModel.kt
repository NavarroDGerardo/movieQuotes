package com.example.moviequotes.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviequotes.model.ImageModel
import com.example.moviequotes.model.MensajeModel
import com.example.moviequotes.model.MensajesProvider

class MensajesViewModel : ViewModel() {
    val mensajesModelo = MutableLiveData<MensajeModel>()
    val imagenModelo = MutableLiveData<ImageModel>()

    fun randomContent(){
        val posicion = MensajesProvider.randomNumber()
        val mensaje = MensajesProvider.getMensaje(posicion)
        val imagen = MensajesProvider.getImagen(posicion)
        mensajesModelo.postValue(mensaje)
        imagenModelo.postValue(imagen)
    }

}