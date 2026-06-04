package com.example.advance_kotlinapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.advance_kotlinapp.di.initKoin
import com.example.advance_kotlinapp.presentation.App

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Advancekotlinapp",
    ) {
        App()
    }
}