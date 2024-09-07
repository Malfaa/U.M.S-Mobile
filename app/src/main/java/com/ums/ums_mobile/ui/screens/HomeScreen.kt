package com.ums.ums_mobile.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ums.ums_mobile.ui.components.MainBackgrounds
import com.ums.ums_mobile.ui.components.MainButtons
import com.usm.usm_mobile.R

@Composable
fun HomeScreen(navController: NavHostController ){
    MainBackgrounds{

        Image(painterResource(id = R.drawable.logo_160), contentDescription = stringResource(id =
        R.string.logo))

        Column(
            verticalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            //UserScreen
            MainButtons(nav = "users", buttonText = R.string.users, navController = navController)

            //ManagementScreen
            MainButtons(nav = "management", buttonText = R.string.management, navController = navController)

            //ConfigurationScreen
            MainButtons(nav = "configuration", buttonText = R.string.configuration, navController = navController)

            //LoginScreen
            MainButtons(nav = "login", buttonText = R.string.logout, navController = navController)
        }
    }
}
