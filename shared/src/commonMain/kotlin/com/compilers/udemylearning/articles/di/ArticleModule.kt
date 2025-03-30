package com.compilers.udemylearning.articles.di

import com.compilers.udemylearning.data.ArticleDataSource
import com.compilers.udemylearning.data.ArticleRepository
import com.compilers.udemylearning.data.ArticlesService
import com.compilers.udemylearning.application.ArticlesUseCase
import com.compilers.udemylearning.presentation.ArticlesViewModel
import org.koin.dsl.module

val articleModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticleDataSource> { ArticleDataSource(get()) }
    single<ArticleRepository> { ArticleRepository(get(), get()) }
}
