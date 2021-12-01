package com.example.myapplication

import android.content.Context
import android.provider.CalendarContract
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import java.net.URL

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

//    fun delete(order: Order): Response {
//        if (AndroidUtils.isInternetDisponivel()) {
//           // val url = "$host/disciplinas/${order.id}"
//           // val json = HttpHelper.delete(url)
//
//           // return parserJson(json)
//        } else {
//            val dao = DatabaseManager.getOrderDAO()
//           // dao.delete(disciplina)
//           // return Response(status = "OK", msg = "Dados salvos localmente")
//        }
//
//    }

}