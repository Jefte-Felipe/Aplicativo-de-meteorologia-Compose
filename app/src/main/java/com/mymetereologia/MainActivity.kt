package com.mymetereologia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mymetereologia.ui.feature.WeatherRoute
import com.mymetereologia.ui.theme.MyMetereologiaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMetereologiaTheme {
                // A surface container using the 'background' color from the theme
                WeatherRoute()
            }
        }
    }
}