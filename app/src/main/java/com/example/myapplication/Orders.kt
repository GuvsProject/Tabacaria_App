package com.example.myapplication
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "order")
class Order: Serializable {

    @PrimaryKey
    var id: Long? = null
    var status = ""
    var precoTotal = "0"
    var foto = ""
//    var professor = ""
}