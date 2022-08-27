package com.nahid.retrofit_in_kotlin.model

data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)