package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ums.ums_mobile.data.model.User
import com.ums.ums_mobile.ui.theme.BackgroudList

@Composable
fun List(items: List<User>){
    LazyColumn (modifier = Modifier
        .border(width = 1.dp, color = Color(0x66000000))
        .width(340.dp)
        .height(387.dp)
        .background(color = BackgroudList)
        .padding(top = 15.dp, bottom = 15.dp)
    ){
        items(items) {item ->

        }

    }
}

@Composable
fun Item(){ //fazer com que receba do repositório os valores dos users

}