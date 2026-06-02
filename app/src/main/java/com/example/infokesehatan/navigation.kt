package com.example.infokesehatan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "homescreen"
    ) {

        composable(route = "homescreen") {
            MyHealthApp(navController)
        }

        composable(route = "profilescreen") {
            ProfileScreen(navController)
        }
    }
}