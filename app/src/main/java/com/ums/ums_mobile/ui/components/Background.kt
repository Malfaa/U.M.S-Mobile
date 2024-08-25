package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ums.ums_mobile.ui.theme.GradientBrush

@Composable
fun Backgrounds(){
    Column(
        verticalArrangement = Arrangement.spacedBy(62.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
//            .padding(start = 50.dp, top = 38.dp, end = 50.dp, bottom = 38.dp)
            .background(GradientBrush)
    ){

    }
}
