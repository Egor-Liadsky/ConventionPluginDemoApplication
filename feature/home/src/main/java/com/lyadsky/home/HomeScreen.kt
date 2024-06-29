package com.lyadsky.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lyadsky.data.model.Note

@Composable
fun HomeScreen(viewModel: HomeViewModel) {

    val state = viewModel.state.collectAsState()

    LazyColumn {
        items(items = state.value) { note ->
            NoteCardItem(Modifier.padding(16.dp), note = note)
        }
    }
}

@Composable
private fun NoteCardItem(modifier: Modifier = Modifier, note: Note) {
    Column(
        modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = note.title)

        Text(text = note.description,)
    }
}