package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Config : NavigationDrawerActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.config)
        configuraMenuLateral()
    }
}


