package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ums.ums_mobile.ui.theme.BorderColor
import com.ums.ums_mobile.ui.theme.ButtonBG
import com.usm.usm_mobile.R

@Composable
fun HomeScreen(navController: NavController){

    Button(
        onClick = { navController.navigate("users") },
        modifier = Modifier
            .border(
                width = 1.dp,
                color = BorderColor,
                shape = RoundedCornerShape(size = 30.dp)
            )
            .width(260.dp)
            .height(55.dp)
            .background(color = ButtonBG, shape = RoundedCornerShape(size = 30.dp))
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)) {
        Text(
            text = stringResource(id = R.string.users),
            style = TextStyle(
                fontSize = 20.sp,
//                fontFamily = FontFamily(Font(R.font.lato)),
//                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            )
        )
    }

    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .border(
                width = 1.dp,
                color = BorderColor,
                shape = RoundedCornerShape(size = 30.dp)
            )
            .width(260.dp)
            .height(55.dp)
            .background(color = ButtonBG, shape = RoundedCornerShape(size = 30.dp))
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)

    ) {

    }

    Button(onClick = { /*TODO*/ }) {

    }

    Button(onClick = { /*
    voltar para a tela Login
    desconectar Firebase
    */ }) {

    }


}