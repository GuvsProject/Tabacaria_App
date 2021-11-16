package com.example.myapplication

import android.app.Application

class myappAplication: Application() {
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        private var appInstance: myappAplication? = null

        fun getInstance(): myappAplication {
            if (appInstance == null) {
                throw IllegalStateException("Configurar application no Manifest")
            }
            return appInstance!!
        }
    }
}