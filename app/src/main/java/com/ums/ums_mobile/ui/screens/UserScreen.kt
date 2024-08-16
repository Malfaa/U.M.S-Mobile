package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.usm.usm_mobile.R

@Composable
fun UserScreen(navController: NavController){
    Image(
        painter = painterResource(id = R.drawable.adicionar_button),
        contentDescription = "image description",
        contentScale = ContentScale.None,
        modifier = Modifier
            .padding(1.dp)
            .width(40.dp)
            .height(40.dp)
    )

    Text(
        text = stringResource(id = R.string.users),
        style = TextStyle(
            fontSize = 48.sp,
//            fontFamily = FontFamily(Font(R.font.lato)),
//            fontWeight = FontWeight(400),
            color = Color(0xFFFFFFFF),
        ),
        modifier = Modifier
            .width(119.dp)
            .height(58.dp)
    )

//    List(items =)

}