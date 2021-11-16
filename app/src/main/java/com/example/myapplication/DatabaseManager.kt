package com.example.myapplication

import androidx.room.Room.*

object DatabaseManager {
    private var dbInstance: MyappDatabase

    init {
        val context = MyappAplication.getInstance().applicationContext
        dbInstance = databaseBuilder(
            context,
            MyappDatabase::class.java,
            "myapp.sqlite"
        ).build()
    }

    fun getOrderDAO(): OrderDAO {
        return dbInstance.OrderDAO()
    }
}