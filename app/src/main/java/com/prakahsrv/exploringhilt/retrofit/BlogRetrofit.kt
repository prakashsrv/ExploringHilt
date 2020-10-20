package com.prakahsrv.exploringhilt.retrofit

import retrofit2.http.GET

interface BlogRetrofit {

    @GET("blogs")
    suspend fun getStuff(): List<BlogNetworkEntity>


}