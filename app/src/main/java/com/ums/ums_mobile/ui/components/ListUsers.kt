package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ums.ums_mobile.ui.theme.BackgroudList
import com.ums.ums_mobile.ui.theme.USM_MobileTheme

@Composable
fun ListUsers(){
    Box(
        modifier = Modifier
            .border(
                width = 1.dp, color = Color(0x66000000),
                shape = RoundedCornerShape(12)
            )
            .background(color = BackgroudList, shape = RoundedCornerShape(12))
            .padding(start = 20.dp, top = 35.dp, end = 20.dp, bottom = 35.dp)
    ) {LazyColumn (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        //items(items) {item ->

        // }

    }}
}

@Composable
fun Item(){ //fazer com que receba do repositório os valores dos users

}

@Preview(showBackground = true)
@Composable
fun ListUsersPreview() {
    USM_MobileTheme {
        ListUsers()
    }

}