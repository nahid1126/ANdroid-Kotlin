package com.nahid.retrofit_in_kotlin.api

import com.nahid.retrofit_in_kotlin.model.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "a1509f6c8b1c4462a8d84bb846ee1019"
//https://newsapi.org/v2/everything?domains=wsj.com&apiKey=a1509f6c8b1c4462a8d84bb846ee1019

interface ApiInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getNewsHeadLine(
        @Query("country") country: String,
        @Query("page") page: Int):Call<News>
}
