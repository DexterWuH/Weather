package com.example.weather.network

import com.example.weather.data.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {
    @GET("forecast")
    suspend fun getWeatherTypes(
    @Query("lat") latitude: String,
    @Query("lon") longitude: String,
    @Query("appid") ApiKey: String
    ): WeatherResponse
}

