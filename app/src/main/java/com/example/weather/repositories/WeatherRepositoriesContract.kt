package com.example.weather.repositories

import com.example.weather.data.MainWeather

interface WeatherRepositoriesContract {
    suspend fun getWeatherTypes(weather: String): List<MainWeather>
}