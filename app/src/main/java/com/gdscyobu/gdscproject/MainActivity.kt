package com.gdscyobu.gdscproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gdscyobu.gdscproject.ui.theme.SolutionChallengeTheme
import com.gdscyobu.gdscproject.views.LoginScreen
import com.gdscyobu.gdscproject.views.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolutionChallengeTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login_screen"){
                    composable("login_screen"){
                        LoginScreen(navController = navController)
                    }
                    composable("register_screen"){
                        RegisterScreen(navController = navController)
                    }
                }
            }
        }
    }
}

