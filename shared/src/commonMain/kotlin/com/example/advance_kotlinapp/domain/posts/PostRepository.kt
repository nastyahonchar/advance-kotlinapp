package com.example.advance_kotlinapp.domain.posts

import com.example.advance_kotlinapp.data.common.NetworkResult
import com.example.advance_kotlinapp.data.posts.model.responses.Posts

internal interface PostRepository {
    suspend fun getAllPosts(): NetworkResult<Posts>
}