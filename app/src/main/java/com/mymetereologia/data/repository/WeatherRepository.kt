package com.mymetereologia.data.repository

import com.mymetereologia.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lng: Double): WeatherInfo
}