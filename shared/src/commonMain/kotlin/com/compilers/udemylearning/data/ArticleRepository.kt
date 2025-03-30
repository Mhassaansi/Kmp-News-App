package com.compilers.udemylearning.data

class ArticleRepository(
    private val dataSource: ArticleDataSource, private val service: ArticlesService
) {

    suspend fun getArticles(): List<ArticleRaw> {
        val articlesDb = dataSource.getAllArticles()

        println("Got ${articlesDb.size} articles from database}")

        if (articlesDb.isEmpty()) {
            val articles = service.fetchArticles()
            dataSource.insertArticles(articles)
            return articles
        }
        return articlesDb
    }

}