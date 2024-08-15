package com.ums.ums_mobile.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val startColor = Color(0xFF008748) // Verde sem opacidade
val endColor = Color(0xFFFFFFFF)
val gradientBrush = Brush.linearGradient( //background
    colors = listOf(startColor, endColor),
    start = Offset(0f, 0f), // Ponto de início do gradiente
    end = Offset(1000f, 1000f) // Ponto de término do gradiente
)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)