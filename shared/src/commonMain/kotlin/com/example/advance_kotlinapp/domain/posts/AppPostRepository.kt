package com.example.advance_kotlinapp.domain.posts

import com.example.advance_kotlinapp.data.common.NetworkResult
import com.example.advance_kotlinapp.data.posts.PostApiService
import com.example.advance_kotlinapp.data.posts.model.responses.Posts

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getAllPosts(): NetworkResult<Posts> {
        return postApiService.getAllPosts()
    }
}