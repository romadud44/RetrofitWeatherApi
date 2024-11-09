package com.example.retrofitweatherapi

import java.io.Serializable

data class WeatherPager(val text: String, val img: Int, val checkButton: Boolean) : Serializable {
    companion object {
        val pager = mutableListOf(
            WeatherPager("Ничто так не портит прогнозы, как погода.", R.drawable.weather_one, true),
            WeatherPager(
                "Если ваши мысли светлы — вас не омрачит даже самая ненастная погода.",
                R.drawable.weather_two, true
            ),
            WeatherPager(
                "Не бывает плохой погоды, бывает плохое настроение.",
                R.drawable.weather_three, false
            )
        )
    }
}