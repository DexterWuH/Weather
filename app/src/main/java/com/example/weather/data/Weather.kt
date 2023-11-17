package com.example.weather.data

data class MainWeather(
 val weather: List<Type>
)

data class Type(
 val main : String,
 val description: String
)

data class City(
  val name: String,
  val country: String
)


