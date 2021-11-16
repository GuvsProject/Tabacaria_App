package com.example.myapplication
import androidx.room.Database
import androidx.room.RoomDatabase

class myappDatabase {

    @Database(entities = arrayOf(Order::class), version = 1)
    abstract class myappDatabase: RoomDatabase() {
        abstract fun OrderDAO() : OrderDAO
    }
}