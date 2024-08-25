package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ums.ums_mobile.ui.theme.ButtonBG
import com.ums.ums_mobile.ui.theme.ItemBackground
import com.ums.ums_mobile.ui.theme.endColor

@Composable
fun UserItem(nome:String, matricula:String){
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(width = 1.dp, color = ButtonBG)
            .width(310.dp)
            .height(100.dp)
            .background(color = ItemBackground)
            .padding(start = 5.dp, end = 5.dp)
    ) {
        Text(
            text = "Nome: $nome",
            style = TextStyle(
                fontSize = 20.sp,
                //fontFamily = FontFamily(Font(R.font.lato)),
                //fontWeight = FontWeight(400),
                color = endColor,
            )
        )

        Text(
            text = "Matrícula: $matricula",
            style = TextStyle(
                fontSize = 20.sp,
                //fontFamily = FontFamily(Font(R.font.lato)),
                //fontWeight = FontWeight(400),
                color = endColor,
            )
        )

        ConfigButton()

    }
}