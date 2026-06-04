package com.example.advance_kotlinapp.data.posts

import io.ktor.client.HttpClient

internal class AppPostApiService (
    private val client: HttpClient
) : PostApiService {


}