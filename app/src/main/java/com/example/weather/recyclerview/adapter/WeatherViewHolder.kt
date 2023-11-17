package com.example.weather.recyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.weather.data.MainWeather
import com.example.weather.databinding.WeatherViewHolderBinding

class WeatherViewHolder (

    private val binding: WeatherViewHolderBinding
    ): RecyclerView.ViewHolder(binding.root){

    fun onBindViewHolder(data: MainWeather){
        binding.weatherDetails.text = data.main
            binding.cityDetails.text = data.weather
    }
}
