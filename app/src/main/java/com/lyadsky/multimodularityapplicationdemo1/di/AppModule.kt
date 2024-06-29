package com.lyadsky.multimodularityapplicationdemo1.di

import com.lyadsky.data.repository.NoteRepository
import com.lyadsky.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { NoteRepository() }

    viewModel { HomeViewModel(get()) }
}