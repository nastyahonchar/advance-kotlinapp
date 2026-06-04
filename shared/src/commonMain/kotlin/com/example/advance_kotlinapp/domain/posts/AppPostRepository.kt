package com.example.advance_kotlinapp.domain.posts

import com.example.advance_kotlinapp.data.posts.PostApiService

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

}