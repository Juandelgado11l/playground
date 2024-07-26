package com.juandelgado11l.playground.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.juandelgado11l.playground.ui.screens.LoginScreen
import com.juandelgado11l.playground.ui.screens.SignInScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = startDestination
    ) {

        composable(NavigationItem.Login.route) {
        LoginScreen(navHostController)
        }
        composable(NavigationItem.SignIn.route) {
            SignInScreen()
        }
        composable(NavigationItem.SignUp.route) {

        }
    }
}
