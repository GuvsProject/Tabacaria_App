package com.example.myapplication
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Order::class), version = 1)
abstract class MyappDatabase: RoomDatabase() {
    abstract fun OrderDAO() : OrderDAO
}
