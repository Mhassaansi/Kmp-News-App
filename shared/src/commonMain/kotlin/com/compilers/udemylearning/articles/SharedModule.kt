package com.compilers.udemylearning.articles

import com.compilers.udemylearning.articles.di.articleModule
import com.compilers.udemylearning.di.networkModule


val sharedModule = listOf(
    articleModule,
    networkModule
)