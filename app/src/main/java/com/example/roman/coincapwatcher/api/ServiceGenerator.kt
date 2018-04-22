package com.example.roman.coincapwatcher.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

object ServiceGenerator {
    private val BASE_URL = "https://api.coinmarketcap.com/v1/"
    private val httpClient = OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
    private val retrofit = Retrofit.Builder()
            .client(httpClient.build())
            .baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory()).build()
    val serverApi: ServerApi
        get() = retrofit.create(ServerApi::class.java)
}