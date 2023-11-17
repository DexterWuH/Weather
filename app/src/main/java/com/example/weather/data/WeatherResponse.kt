package com.example.weather.data

data class WeatherResponse(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val main: List<MainWeather>,
    val city_list: List<City>
)
