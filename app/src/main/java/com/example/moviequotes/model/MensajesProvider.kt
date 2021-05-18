package com.example.moviequotes.model

import com.example.moviequotes.R

class MensajesProvider {
    companion object{
        fun randomNumber():Int{
            val posicion = (0..mensajes.size-1).random()
            return posicion
        }

        fun getMensaje(posicion: Int):MensajeModel{
            return mensajes[posicion]
        }

        fun getImagen(posicion: Int):ImageModel{
            return imagenes[posicion]
        }

        private val mensajes = listOf<MensajeModel>(
            MensajeModel(mensaje = "Frankly, my dear, I don’t give a damn."),
            MensajeModel(mensaje = "May the Force be with you."),
            MensajeModel(mensaje = "You talking to me?"),
            MensajeModel(mensaje = "E.T. phone home."),
            MensajeModel(mensaje = "Bond. James Bond."),
            MensajeModel(mensaje = "Show me the money!"),
            MensajeModel(mensaje = "You can't handle the truth!"),
            MensajeModel(mensaje = "Mama always said life was like a box of\n" +
                    "chocolates. You never know what you're\n" +
                    "gonna get"),
            MensajeModel(mensaje = "Keep your friends close, but your enemies\n" +
                    "closer."),
            MensajeModel(mensaje = "I´m Batman"),
            MensajeModel(mensaje = "Why So Serious???"),

            )

        private val imagenes = listOf<ImageModel>(
            ImageModel(image = R.drawable.franklymydear),
            ImageModel(image = R.drawable.starwars),
            ImageModel(image = R.drawable.talkingtome),
            ImageModel(image = R.drawable.extraterrestre),
            ImageModel(image = R.drawable.bondjames),
            ImageModel(image = R.drawable.jerry),
            ImageModel(image = R.drawable.afewgoodmen),
            ImageModel(image = R.drawable.forest),
            ImageModel(image = R.drawable.godfather),
            ImageModel(image = R.drawable.batman),
            ImageModel(image = R.drawable.joker)
        )
    }
}