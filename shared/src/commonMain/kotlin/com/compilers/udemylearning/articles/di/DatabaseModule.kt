package com.compilers.udemylearning.articles.di

import app.cash.sqldelight.db.SqlDriver
import com.compilers.udemylearning.db.DatabaseDriverFactory
import com.udemylearning.UdemyLearningDatabase
import org.koin.dsl.module


val dataBaseModule = module {
    single<SqlDriver> {DatabaseDriverFactory(androidContext()).createDriver()}
    single<UdemyLearningDatabase> { UdemyLearningDatabase(get()) }
}