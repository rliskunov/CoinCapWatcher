package com.example.roman.coincapwatcher.api

import com.example.roman.coincapwatcher.models.CoinCap
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {
    @GET("ticker")
    fun loadData(@Query("limit") limit: Int): Deferred<List<CoinCap>>
}