package com.example.myfulljetpackcompose.data.datasource

import com.example.myfulljetpackcompose.data.api.ApiService
import com.example.myfulljetpackcompose.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getNewsHeadLine(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadLine(country)
    }
}