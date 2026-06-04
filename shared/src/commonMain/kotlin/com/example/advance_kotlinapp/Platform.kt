package com.example.advance_kotlinapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform