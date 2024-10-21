package com.example.lab11_fb01

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab11_fb01.presentation.home.HomeScreen
import com.example.lab11_fb01.presentation.login.LoginScreen
import com.example.lab11_fb01.presentation.singup.SignUpScreen
import com.google.firebase.auth.FirebaseAuth

@Composable
fun NavigationWrapper(
    navHostController: NavHostController,

) {

    NavHost(navController = navHostController, startDestination = "home") {
        composable("initial") {
            HomeScreen()
        }
        composable("logIn") {
            LoginScreen()
        }
        composable("signUp") {
            SignUpScreen()
        }
        composable("home"){
            HomeScreen()
        }
    }
}
