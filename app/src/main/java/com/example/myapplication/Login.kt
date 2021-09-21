package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.widget.Toast


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val nomeUsuario = findViewById<TextInputEditText>(R.id.textInputSenha)
        val senhaUsuario = findViewById<TextInputEditText>(R.id.textInputName)
        val btnRealizaLogin = findViewById<Button>(R.id.btnRealizaLogin)


        btnRealizaLogin.setOnClickListener {

            val usuario:String = nomeUsuario.text.toString()
            val senha:String = senhaUsuario.text.toString()
            var valida = checkUsuario(usuario,senha)

            if (valida) {
                Toast.makeText(this,"Usuario Autenticado... você será redirecionado para outra pagina", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Usuário ou senha incorretos", Toast.LENGTH_LONG).show()

            }

            if (valida) {
                var intent = Intent(this, VisualizaReservas::class.java)
                startActivity(intent)

            }
        }




    }
}

fun checkUsuario(nome:String ,senha:String): Boolean {
    var retorno = false
    var p1: String = nome
    var p2: String = senha
    val usuarioEsperado = "aluno"
    val senhaEsperada = "impacta"
    if (p1.equals(usuarioEsperado) and p2.equals(senhaEsperada)) {
        retorno = true
    } else {
        retorno = false
    }
    return retorno
}
