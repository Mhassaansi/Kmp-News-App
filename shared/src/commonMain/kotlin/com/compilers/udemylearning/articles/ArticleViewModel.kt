package com.compilers.udemylearning.articles

import com.compilers.udemylearning.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ArticleViewModel : BaseViewModel() {

   private val _articleState : MutableStateFlow<ArticleState> = MutableStateFlow(ArticleState(loading = true))

    val articleState:StateFlow<ArticleState> get() = _articleState

    init {
        getArticles()
    }


    private fun getArticles(){
        scope.launch {
//            delay(1500)
//            _articleState.emit(ArticleState(error = "Some thing went wrong"))
            delay(1500)
            val fetchArticles = fetchArticles()
            _articleState.emit(ArticleState(articles = fetchArticles))
        }
    }

    private suspend fun fetchArticles():List<Article> = mockArticles

    val mockArticles = listOf(
        Article(
            title = "Exploring Kotlin Coroutines",
            desc = "An in-depth guide to understanding and implementing Kotlin coroutines for asynchronous programming.",
            date = "2024-12-30",
            imageUrl = "https://shorturl.at/pywhT"
        ),
        Article(
            title = "Mastering Jetpack Compose",
            desc = "A comprehensive tutorial on building modern UIs using Jetpack Compose.",
            date = "2024-12-25",
            imageUrl = "https://shorturl.at/pywhT"
        ),
        Article(
            title = "Understanding Dependency Injection",
            desc = "Learn how dependency injection simplifies Android app development.",
            date = "2024-12-20",
            imageUrl = "https://shorturl.at/pywhT"
        ),
        Article(
            title = "MVVM Architecture Explained",
            desc = "A beginner's guide to implementing the MVVM pattern in Android development.",
            date = "2024-12-15",
            imageUrl = "https://shorturl.at/pywhT"
        ),
        Article(
            title = "Optimizing Android Apps",
            desc = "Tips and tricks to enhance performance and memory management in Android apps.",
            date = "2024-12-10",
            imageUrl = "https://shorturl.at/pywhT"
        )
    )

}