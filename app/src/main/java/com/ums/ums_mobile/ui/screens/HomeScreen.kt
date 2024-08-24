package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ums.ums_mobile.ui.components.MainButtons
import com.ums.ums_mobile.ui.theme.GradientBrush
import com.usm.usm_mobile.R

@Composable
fun HomeScreen(navController: NavHostController ){
    Column( //TODO fazer um Composable Surface para colocar de BackGround das Column
        verticalArrangement = Arrangement.spacedBy(62.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
//            .padding(start = 50.dp, top = 38.dp, end = 50.dp, bottom = 38.dp)
            .background(GradientBrush)
    ) {

        Image(painterResource(id = R.drawable.logo_160), contentDescription = stringResource(id =
        R.string.logo))

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            //UserScreen
            MainButtons(nav = "users", buttonText = "users", navController = navController)

            //ManagementScreen
            MainButtons(nav = "management", buttonText = "management", navController = navController)

            //ConfigurationScreen
            MainButtons(nav = "configuration", buttonText = "configuration", navController = navController)

            //LoginScreen
            MainButtons(nav = "login", buttonText = "logout", navController = navController)
        }
    }
}
