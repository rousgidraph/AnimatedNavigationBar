package art.gidraph.animatednavigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import art.gidraph.animatednavigationbar.screens.HomeScreen
import art.gidraph.animatednavigationbar.screens.ProfileScreen

import art.gidraph.animatednavigationbar.screens.SearchScreen


@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Search.route) {
            SearchScreen()
        }
    }
}