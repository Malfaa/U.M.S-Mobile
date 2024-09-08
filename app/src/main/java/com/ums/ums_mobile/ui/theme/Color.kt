package com.ums.ums_mobile.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val ButtonBG = Color(0x66D9D9D9)
val BorderColor = Color(0x66000000)
val BackgroudList = Color(0xD301D5DA)
val middleColor = Color(0xFF034078)
val startColor = Color(0xFF001F54)
val endColor = Color(0xFF1282A2)
val BackgroundGradient = Brush.verticalGradient(
    colors = listOf(startColor, middleColor, endColor), 0f, Float.POSITIVE_INFINITY
)
//val WhiteColor = Color(0xFFFFFFFF)
val TextFieldBG = Color(0xB2DCDCDC)
val ItemBackground = Color(0x33DCDCDC)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

/*
Modifier
  .border(width = 1.dp, color = Color(0x66000000))
  .width(340.dp)
  .height(387.dp)
  .background(color = Color(BackgroudList))
  .padding(top = 15.dp, bottom = 15.dp)
 */