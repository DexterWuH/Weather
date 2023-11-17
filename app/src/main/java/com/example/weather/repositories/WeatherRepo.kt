package com.example.weather.repositories

import com.example.weather.network.WeatherApi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class WeatherRepo @Inject constructor(
    private val api: WeatherApi,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {
}