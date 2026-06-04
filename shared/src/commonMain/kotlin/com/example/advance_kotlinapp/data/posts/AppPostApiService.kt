package com.example.advance_kotlinapp.data.posts

import com.example.advance_kotlinapp.data.common.NetworkResult
import io.ktor.client.request.get
import io.ktor.client.request.accept
import io.ktor.http.ContentType
import com.example.advance_kotlinapp.data.common.safeRequest
import io.ktor.client.HttpClient
import com.example.advance_kotlinapp.data.posts.model.responses.Posts

internal class AppPostApiService (
    private val client: HttpClient
) : PostApiService {

    override suspend fun getAllPosts(): NetworkResult<Posts> {
        return client.safeRequest {
            get("$BASE_URL$POSTS_API") {
                accept(ContentType.Application.Json)
            }
        }
    }

}