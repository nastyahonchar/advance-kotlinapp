package com.example.advance_kotlinapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import com.example.advance_kotlinapp.di.initKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AppApplication)
            androidLogger()
        }
    }
}