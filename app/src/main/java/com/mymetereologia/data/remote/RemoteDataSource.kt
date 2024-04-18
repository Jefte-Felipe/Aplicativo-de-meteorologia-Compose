package com.mymetereologia.data.remote

import com.mymetereologia.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Double, lng: Double): WeatherDataResponse
}