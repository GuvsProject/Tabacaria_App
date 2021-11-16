package com.example.myapplication

import androidx.room.Room.*

object DatabaseManager {
    private var dbInstance: myappDatabase

    init {
        val context = myappAplication.getInstance().applicationContext
        dbInstance = databaseBuilder(
            context,
            myappDatabase::class.java,
            "myapp.sqlite"
        ).build()
    }

    fun getOrderDAO(): OrderDAO {
        return dbInstance.OrderDAO()
    }
}