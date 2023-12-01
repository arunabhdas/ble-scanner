package com.arunabhdas.scan.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.arunabhdas.scan.domain.models.AppDestinations.CONTROL
import com.arunabhdas.scan.domain.models.AppDestinations.HOME
import com.arunabhdas.scan.domain.models.AppRoutes.CONTROL_SCREEN
import com.arunabhdas.scan.domain.models.AppRoutes.HELP_ABOUT
import com.arunabhdas.scan.presentation.control.ControlScreen
import com.arunabhdas.scan.presentation.help.AboutScreen
import com.arunabhdas.scan.presentation.scan.HomeRoute
import com.arunabhdas.scan.utils.windowinfo.AppLayoutInfo

@Composable
fun AppNavGraph(
    navController: NavHostController,
    startDestination: String,
    appLayoutInfo: AppLayoutInfo,
    openDrawer: () -> Unit = {},
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(HOME) {
            HomeRoute(
                onControlClick = { deviceAddress ->
                    navController.navigate("$CONTROL_SCREEN/$deviceAddress")
                },
                appLayoutInfo = appLayoutInfo,
                onHelpClicked = {navController.navigate(HELP_ABOUT)}
            )
        }
        composable(CONTROL) {
            ControlScreen(
                appLayoutInfo = appLayoutInfo,
                onBackClicked = {navController.popBackStack()}
            )
        }
        composable(HELP_ABOUT) {
            AboutScreen(
                appLayoutInfo = appLayoutInfo,
                onBackClicked = {navController.popBackStack()}
            )
        }
    }
}
