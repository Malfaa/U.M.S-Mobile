package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.ums.ums_mobile.ui.theme.BackgroudList

@Composable
fun ListUsers(){
    LazyColumn (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .border(
            width = 1.dp, color = Color(0x66000000),
            shape = RoundedCornerShape(12)
        )
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = BackgroudList)
        .padding(start = 20.dp, top = 35.dp, end = 20.dp, bottom = 35.dp)
    ){
        //items(items) {item ->

       // }

    }
}

@Composable
fun Item(){ //fazer com que receba do repositório os valores dos users

}