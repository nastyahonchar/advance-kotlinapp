package com.example.advance_kotlinapp.presentation

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import com.example.advance_kotlinapp.domain.posts.PostRepository

@Stable
class AppViewModel internal constructor(
    private val postRepository: PostRepository
) : ViewModel() {

    private val _state = MutableStateFlow(AppState())
    internal val state: StateFlow<AppState> = _state.asStateFlow()

    private fun toggleProgressVisibility() {
        _state.update { it.copy(isProgressVisible = !it.isProgressVisible) }
    }

    private fun resetPreviousResults() {
        _state.update { it.copy(result = null) }
        _state.update { it.copy(error = null) }
    }
}