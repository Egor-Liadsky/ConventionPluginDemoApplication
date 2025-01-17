package com.lyadsky.multimodularityapplicationdemo1

import android.app.Application
import com.lyadsky.multimodularityapplicationdemo1.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DemoApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@DemoApplication)
            modules(appModule)
        }
    }
}