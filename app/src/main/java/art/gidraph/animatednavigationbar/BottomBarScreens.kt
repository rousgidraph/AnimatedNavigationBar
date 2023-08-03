package art.gidraph.animatednavigationbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route : String,
    val title : String,
    val icon : ImageVector,
    val ordinal : Int
){
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home,
        ordinal = 0
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person,
        ordinal = 1
    )


    object Search : BottomBarScreen(
        route = "search",
        title = "Search",
        icon = Icons.Default.Search,
        ordinal = 2
    )
}
