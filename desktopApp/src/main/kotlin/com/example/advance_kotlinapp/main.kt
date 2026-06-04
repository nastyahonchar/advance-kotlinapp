package com.example.advance_kotlinapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Advancekotlinapp",
    ) {
        App()
    }
}