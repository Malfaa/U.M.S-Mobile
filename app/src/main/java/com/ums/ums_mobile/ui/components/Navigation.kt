package com.ums.ums_mobile.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ums.ums_mobile.ui.screens.HomeScreen
import com.ums.ums_mobile.ui.screens.UsersScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){ HomeScreen(navController)}
        composable("users"){ UsersScreen(navController)}
    }
}