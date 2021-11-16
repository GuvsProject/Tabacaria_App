package com.example.myapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

object OrderDAO {
    @Dao
    interface OrderDAO {

        @Query("SELECT * FROM order WHERE id=:id ")
        fun getById(id: Long): Order?

        @Query("SELECT * FROM order")
        fun findAll(): List<Order>

        @Insert
        fun insert(order: Order)

        @Delete
        fun delete(order: Order)
    }

}