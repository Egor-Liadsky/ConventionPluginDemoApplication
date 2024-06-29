package com.lyadsky.multimodularityapplicationdemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lyadsky.home.HomeScreen
import com.lyadsky.home.HomeViewModel
import org.koin.compose.koinInject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val homeViewModel: HomeViewModel = koinInject()
            HomeScreen(viewModel = homeViewModel)
        }
    }
}