package com.compilers.udemylearning.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticleRaw(
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val desc: String?,
    @SerialName("publishedAt")
    val date: String,
    @SerialName("urlToImage")
    val imageUrl: String?
)


@Serializable
data class Source(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String
)