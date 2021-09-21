package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class VisualizaReservas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.visualiza_reservas)
//        setSupportActionBar(findViewById(R.id.vrtoolbar))
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
//        return true
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        val id = item.itemId

        if (id == R.id.action_signout) {
            // IMPLEMENTAR A LÓGICA NECESSÁRIA PARA TRATAMANTO DE EVENTO DO ITEM DE MENU
            Toast.makeText(this, "Deslogando...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        } else if (id == R.id.action_update) {
            Toast.makeText(this, "Atualizando", Toast.LENGTH_SHORT).show()
            val progressBarRv = findViewById<ProgressBar>(R.id.progressBarRv)


        } else if (id == R.id.action_config) {
            Toast.makeText(this, "Redirecionando para as Configurações", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Config::class.java)
            startActivity(intent)
//        } else if (id == android.R.id.home) {
//            finish()
        }

        return super.onOptionsItemSelected(item)

    }

}


