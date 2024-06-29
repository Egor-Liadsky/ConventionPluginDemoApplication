package com.lyadsky.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lyadsky.data.model.Note
import com.lyadsky.data.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel(
    private val noteRepository: NoteRepository
): ViewModel() {

    private val _state = MutableStateFlow(listOf<Note>())
    val state = _state.asStateFlow()

    init {
        getNotes()
    }

    private fun getNotes() = viewModelScope.launch(Dispatchers.IO) {
        val response = noteRepository.getNotes()
        _state.update { response }
    }
}