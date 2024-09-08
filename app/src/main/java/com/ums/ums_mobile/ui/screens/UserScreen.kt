package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ums.ums_mobile.ui.components.AddButton
import com.ums.ums_mobile.ui.components.HomeButton
import com.ums.ums_mobile.ui.components.ListUsers
import com.ums.ums_mobile.ui.components.RefreshButton
import com.ums.ums_mobile.ui.components.UsersBackgrounds
import com.usm.usm_mobile.R

@Composable
fun UserScreen(navController: NavHostController, /*viewModel: */){
    UsersBackgrounds {
        HomeButton(navController)
        Spacer(modifier = Modifier.height(65.dp))
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            modifier = Modifier.fillMaxWidth()
        ){ Icon(
            painter = painterResource(id = R.drawable.user_icon),
            contentDescription = stringResource(id = R.string.users),
            )

            Text(
                text = stringResource(id = R.string.users),
                //fontFamily = ,
                style = TextStyle(
                    fontSize = 48.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                ),
            )
        }
        Spacer(modifier = Modifier.height(65.dp))
        Row(
            horizontalArrangement = Arrangement.End,
//                verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            AddButton(navController = navController, nav = "addScreen")
            RefreshButton(R.string.refresh_btn_descrip)
        }

    ListUsers()
    }
}