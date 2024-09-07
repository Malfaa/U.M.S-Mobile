package com.ums.ums_mobile.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.ums.ums_mobile.ui.components.List

val ButtonBG = Color(0x66D9D9D9)
val BorderColor = Color(0x66000000)
val BackgroudList = Color(0xFF03484C)
val startColor = Color(0xFF008748) // Verde sem opacidade
val endColor = Color(0xFFFFFFFF)
val BackgroundGradient = Brush.verticalGradient(
    colors = listOf(startColor, endColor), Float.POSITIVE_INFINITY, 0f
)
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