package com.example.validar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdministradorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrador)

        val tvNombreAdministrador = findViewById<TextView>(R.id.tvNombreAdministrador)

        val nombreRecibido = intent.getStringExtra("nombreAdministrador")

        tvNombreAdministrador.text = "Bienvenido $nombreRecibido"
    }
}
