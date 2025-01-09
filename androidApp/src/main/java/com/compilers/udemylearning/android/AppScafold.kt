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
import com.compilers.udemylearning.android.screens.ArticleScreen
import com.compilers.udemylearning.android.screens.Screens
import com.compilers.udemylearning.android.screens.Screens.*
import com.compilers.udemylearning.articles.ArticleViewModel


@Composable
fun AppScaffold(articleViewModel: ArticleViewModel) {
    val navController = rememberNavController()
    Scaffold {
        AppNavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            articleViewModel
        )
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    articleViewModel: ArticleViewModel
) {


    NavHost(
        navController = navController,
        startDestination = ARTICLES.route,
        modifier = modifier
    ) {
        composable(ARTICLES.route) {
            ArticleScreen(
                onAboutButton = { navController.navigate(ABOUT_SCREEN.route) },
                articleViewModel
            )
        }
        composable(ABOUT_SCREEN.route) {
            AboutScreen(onUpButtonClick = { navController.popBackStack() })
        }

    }
}