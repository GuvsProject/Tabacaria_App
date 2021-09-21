package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.botaoLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        btnCadastro.setOnClickListener{
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }


    }
}


