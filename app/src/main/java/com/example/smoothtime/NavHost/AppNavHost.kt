package com.example.smoothtime.NavHost

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.smoothtime.Screens.RegisterScreen
import com.example.smoothtime.Screens.WelcomeSplash

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.WelcomeSplash.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(NavigationItem.WelcomeSplash.route) {
            WelcomeSplash(navController = navController)
        }
        composable(NavigationItem.RegisterScreen.route) {
            RegisterScreen(navController = navController)
            // Uncomment the above line when you implement the RegisterScreen composable
        }
            // RegisterScreen(navController = navController)
            // Uncomment the above line when you implement the RegisterScreen composable
        }

        // Add more composable destinations here as needed
    }




