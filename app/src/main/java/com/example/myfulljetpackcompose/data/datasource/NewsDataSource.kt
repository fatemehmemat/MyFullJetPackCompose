package com.example.myfulljetpackcompose.data.datasource

import com.example.myfulljetpackcompose.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsDataSource {
    suspend fun getNewsHeadLine(country: String): Response<NewsResponse>
}