package com.compilers.udemylearning.android.di

import com.compilers.udemylearning.articles.ArticlesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
   viewModel{ArticlesViewModel(get())}
}
