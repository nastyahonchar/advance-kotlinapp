package com.example.advance_kotlinapp

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.example.advance_kotlinapp.di.initKoin
import com.example.advance_kotlinapp.presentation.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin { printLogger() }
    ComposeViewport {
        App()
    }
}