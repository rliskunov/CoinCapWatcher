package com.example.roman.coincapwatcher.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CoinCap {
    lateinit var name: String
    lateinit var symbol: String
    var price_usd: Double = 0.0
    var percent_change_24h: Double = 0.0
}