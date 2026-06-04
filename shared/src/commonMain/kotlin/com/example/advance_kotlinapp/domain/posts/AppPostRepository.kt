package com.example.advance_kotlinapp.domain.posts

import com.example.advance_kotlinapp.data.common.NetworkResult
import com.example.advance_kotlinapp.data.posts.PostApiService
import com.example.advance_kotlinapp.data.posts.model.requests.NewPost
import com.example.advance_kotlinapp.data.posts.model.responses.DeletedPost
import com.example.advance_kotlinapp.data.posts.model.responses.Posts
import com.example.advance_kotlinapp.data.posts.model.responses.Post

internal class AppPostRepository(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getAllPosts(): NetworkResult<Posts> {
        return postApiService.getAllPosts()
    }

    override suspend fun addPost(post: NewPost): NetworkResult<Post> {
        return postApiService.addPost(post)
    }

    override suspend fun updatePost(post: Post): NetworkResult<Post> {
        return postApiService.updatePost(post)
    }

    override suspend fun deletePost(postId: Int): NetworkResult<DeletedPost> {
        return postApiService.deletePost(postId)
    }
}