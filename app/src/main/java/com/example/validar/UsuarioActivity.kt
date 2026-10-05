package com.example.validar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UsuarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val tvUsuario = findViewById<TextView>(R.id.tvUsuario)
        val nombreUsuario = intent.getStringExtra("usuario") ?: ""

        tvUsuario.text = "Bienvenido $nombreUsuario"
    }
}
