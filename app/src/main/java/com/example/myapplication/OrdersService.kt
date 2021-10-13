package com.example.myapplication

import android.content.Context

object OrdersService {

    fun getOrders(context: Context): List<Order> {
        val orders = mutableListOf<Order>()

        for (i in 1..10) {
            var d = Order()
            d.status = "Order $i"
            d.precoTotal = "Order $i"
//            d.professor = "Professor $i"
            d.foto = "https://learnenglish.britishcouncil.org/sites/podcasts/files/RS8096_GettyImages-170036776-hig.jpg"
            orders.add(d)
        }

        return orders
    }
}