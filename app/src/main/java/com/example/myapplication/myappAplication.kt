package com.example.myapplication

import android.app.Application

class MyappAplication: Application() {
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        private var appInstance: MyappAplication? = null

        fun getInstance(): MyappAplication {
            if (appInstance == null) {
                throw IllegalStateException("Configurar application no Manifest")
            }
            return appInstance!!
        }
    }
}