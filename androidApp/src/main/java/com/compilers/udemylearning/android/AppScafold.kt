package com.compilers.udemylearning.android

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compilers.udemylearning.android.screens.AboutScreen
import com.compilers.udemylearning.android.screens.ArticlesScreen
import com.compilers.udemylearning.android.screens.Screens.*



@Composable
fun AppScaffold() {
    val navController = rememberNavController()

    Scaffold {
        AppNavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,

) {
    NavHost(
        navController = navController,
        startDestination = ARTICLES.route,
        modifier = modifier,
    ) {
        composable(ARTICLES.route) {
            ArticlesScreen(
                onAboutButtonClick = { navController.navigate(ABOUT_SCREEN.route) },
            )
        }

        composable(ABOUT_SCREEN.route) {
            AboutScreen(
                onUpButtonClick = { navController.popBackStack() }
            )
        }
    }
}