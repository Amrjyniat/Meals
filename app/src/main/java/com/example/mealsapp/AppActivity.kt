package com.example.mealsapp

import android.app.Application
import timber.log.Timber

class AppActivity: Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}