package com.example.weather.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object RetroFit {

    private val baseUrl = "https://api.openweathermap.org/data/2.5/"

    private val client: OkHttpClient =
        OkHttpClient
            .Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .build()

    private val interceptor: HttpLoggingInterceptor =

}

//API KEY: 5100705e0c23d2199c45ff90755585c7