package com.example.advance_kotlinapp.data.posts

import com.example.advance_kotlinapp.data.common.NetworkResult
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.accept
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import com.example.advance_kotlinapp.data.common.safeRequest
import com.example.advance_kotlinapp.data.posts.model.requests.NewPost
import io.ktor.client.HttpClient
import com.example.advance_kotlinapp.data.posts.model.responses.Posts
import com.example.advance_kotlinapp.data.posts.model.responses.Post

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

    override suspend fun addPost(post: NewPost): NetworkResult<Post> {
        return client.safeRequest {
            post("$BASE_URL$POSTS_API/$ADD_POST") {
                contentType(ContentType.Application.Json)
                setBody(post)
            }
        }
    }

}