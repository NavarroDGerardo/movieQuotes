package com.example.moviequotes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.moviequotes.R
import com.example.moviequotes.databinding.ActivityMainBinding
import com.example.moviequotes.viewmodel.MensajesViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private val mensajesViewModel: MensajesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mensajesViewModel.mensajesModelo.observe(this, Observer {
            binding.texto.text = it.mensaje;
        })

        mensajesViewModel.imagenModelo.observe(this, {
            binding.imageView.setImageResource(it.image)
        })

        binding.container.setOnClickListener{ mensajesViewModel.randomContent() }
    }
}