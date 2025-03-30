package com.compilers.udemylearning.presentation

import com.compilers.udemylearning.application.Article

data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)