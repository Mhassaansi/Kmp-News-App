package com.compilers.udemylearning.android

import android.app.Application
import com.compilers.udemylearning.android.di.viewModelModule
import com.compilers.udemylearning.articles.sharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Udemy_Learning : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()

    }

    private fun initKoin() {
        val modules = sharedModule + viewModelModule

        startKoin {
            androidContext(this@Udemy_Learning)
            modules(modules)
        }

    }

}