package com.example.weather.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.data.MainWeather
import com.example.weather.databinding.WeatherViewHolderBinding

class WeatherAdapter: RecyclerView.Adapter<WeatherViewHolder> (){

    private val weather :MutableList<MainWeather> = mutableListOf()

    fun addWeathers(newWeather: List<MainWeather>){
        weather.clear()
        weather.addAll(newWeather)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = WeatherViewHolderBinding.inflate(inflater, parent, false)
        return WeatherViewHolder(binding)
    }

    override fun getItemCount(): Int {
        weather.size
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val data =  weather[position]
        holder.onBindViewHolder(data)
    }

}