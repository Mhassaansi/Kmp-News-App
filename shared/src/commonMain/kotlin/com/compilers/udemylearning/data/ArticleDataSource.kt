package com.compilers.udemylearning.data

import com.udemylearning.UdemyLearningDatabase

class ArticleDataSource(private val database: UdemyLearningDatabase) {

    fun getAllArticles(): List<ArticleRaw> = database.udemyLearningDatabaseQueris.
    selectAllArticles(::mapToArticleRaw).executeAsList()



    fun insertArticles(articles: List<ArticleRaw>) {
        database.udemyLearningDatabaseQueris.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            } } }

    private fun insertArticle(article: ArticleRaw) {
        database.udemyLearningDatabaseQueris.insertArticle(
            title = article.title,
            desc = article.desc,
            date = article.date,
            imageUrl = article.imageUrl)
    }

    fun deleteArticles() = database.udemyLearningDatabaseQueris.deleteArticles()

    private fun mapToArticleRaw(
        title: String,
        desc: String,
        date: String,
        imageUrl: String
    ): ArticleRaw = ArticleRaw(
        title = title,
        desc = desc,
        date = date,
        imageUrl = imageUrl
    )


}