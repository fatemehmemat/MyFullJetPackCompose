package com.example.myfulljetpackcompose.data.api

import com.example.myfulljetpackcompose.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadLine(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String="76047a01b4f24f1abe5e9b9fbee5ec8d"
    ): Response<NewsResponse>


    ///https://newsapi.org/v2/top-headlines?country=us&apiKey=76047a01b4f24f1abe5e9b9fbee5ec8d
}