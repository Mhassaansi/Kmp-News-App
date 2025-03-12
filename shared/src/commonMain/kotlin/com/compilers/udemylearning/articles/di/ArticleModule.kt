package com.compilers.udemylearning.articles.di

import com.compilers.udemylearning.articles.ArticlesService
import com.compilers.udemylearning.articles.ArticlesUseCase
import com.compilers.udemylearning.articles.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}