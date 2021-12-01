package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.toolbar.*

class OrderActivity: DebugActivity() {
    private val context: Context get() = this
    var order: Order? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // recuperar onjeto de Disciplina da Intent
//        if (intent.getSerializableExtra("Ordem") is Order)
//            order = intent.getSerializableExtra("Ordem") as Order

        // configurar título com nome da Disciplina e botão de voltar da Toobar
        // colocar toolbar
//        setSupportActionBar(vrtoolbar)

        // alterar título da ActionBar
        //supportActionBar?.title = order?.status

        // up navigation
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // atualizar dados do carro
        nomeDisciplina.text = order?.status
        Picasso.with(this).load(order?.foto).fit().into(imagemDisciplina,
            object: com.squareup.picasso.Callback{
                override fun onSuccess() {}

                override fun onError() { }
            })
    }

//    // método sobrescrito para inflar o menu na Actionbar
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        // infla o menu com os botões da ActionBar
//        menuInflater.inflate(R.menu.menu_main_disciplina, menu)
//        return true
//    }
//
//   override fun onOptionsItemSelected(item: MenuItem) : Boolean {
//        // id do item clicado
//        val id = item.itemId
//        // verificar qual item foi clicado
//        // remover a disciplina no WS
//        if  (id == R.id.action_remover) {
//            // alerta para confirmar a remeção
//            // só remove se houver confirmação positiva
//            AlertDialog.Builder(this)
//                .setTitle(R.string.app_name)
//                .setMessage("Deseja excluir a disciplina")
//                .setPositiveButton("Sim") {
//                        dialog, which ->
//                    dialog.dismiss()
//                    taskExcluir()
//                }.setNegativeButton("Não") {
//                        dialog, which -> dialog.dismiss()
//                }.create().show()
//        }
//        // botão up navigation
//        else if (id == android.R.id.home) {
//            finish()
//        }
//        return super.onOptionsItemSelected(item)
//
//    }

    private fun taskExcluir() {
        if (this.order != null && this.order is Order) {
            // Thread para remover a solicitacao
            Thread {
                //OrdersService.delete(this.order as Order)
                runOnUiThread {
                    // após remover, voltar para activity anterior
                    finish()
                }
            }.start()
        }
    }

}