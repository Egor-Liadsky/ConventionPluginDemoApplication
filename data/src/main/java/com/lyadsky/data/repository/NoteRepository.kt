package com.lyadsky.data.repository

import com.lyadsky.data.model.Note


class NoteRepository {

    private val notes = mutableListOf(
        Note("Note1", "Description1"),
        Note("Note2", "Description2"),
        Note("Note3", "Description3"),
        Note("Note4", "Description4"),
    )

    suspend fun getNotes(): List<Note> = notes

    suspend fun insertNote(note: Note) {
        notes.add(note)
    }
}