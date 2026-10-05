package com.example.validar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val etNombre = findViewById<EditText>(R.id.etNombre)

        btnIngresar.setOnClickListener {

            val usuario = etUsuario.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val nombre = etNombre.text.toString().trim()

            if (usuario.isEmpty() || password.isEmpty() || nombre.isEmpty()){

                Toast.makeText(
                    this,
                    "Debe completar todos los campos",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (usuario == "admin" && password == "1234") {

                val intent = Intent(this, AdministradorActivity::class.java)
                intent.putExtra("nombreAdministrador", nombre)
                startActivity(intent)


            } else if (usuario == "estudiante" && password == "5678") {

                val intent = Intent(this, UsuarioActivity::class.java)
                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

