package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.visualiza_reservas.*


class VisualizaReservas : NavigationDrawerActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.visualiza_reservas)
        setSupportActionBar(findViewById(R.id.vrtoolbar))

        configuraMenuLateral()
        recyclerOrders?.layoutManager = LinearLayoutManager(this)
        recyclerOrders?.itemAnimator = DefaultItemAnimator()
        recyclerOrders?.setHasFixedSize(true)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
//        return true
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        val id = item.itemId

//        if (id == R.id.action_signout) {
//            // IMPLEMENTAR A LÓGICA NECESSÁRIA PARA TRATAMANTO DE EVENTO DO ITEM DE MENU
//            Toast.makeText(this, "Deslogando...", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, Login::class.java)
//            startActivity(intent)}
        if (id == R.id.action_update) {
            Toast.makeText(this, "Atualizando", Toast.LENGTH_SHORT).show()
            val progressBarRv = findViewById<ProgressBar>(R.id.progressBarRv)
        }

//        } else if (id == R.id.action_config) {
//            Toast.makeText(this, "Redirecionando para as Configurações", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, Config::class.java)
//            startActivity(intent)
////        } else if (id == android.R.id.home) {
////            finish()
//        }

        return super.onOptionsItemSelected(item)

    }

    fun onclickOrder(order: Order) {
        Toast.makeText(this, "Clicou no Pedido ${order.status}", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        taskOrders()
    }

    var orders = listOf<Order>()

    fun taskOrders() {
        this.orders = OrdersService.getOrders(this)
        recyclerOrders?.adapter = OrderAdapter(orders) {onclickOrder(it)}
    }
    val contexto = this
}


