package uz.futuresoft.wallet_wedrive.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import uz.futuresoft.common.navigation.Route
import uz.futuresoft.features.wallet.navigation.walletRoute
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WalletWeDriveTheme {
                Content()
            }
        }
    }
}

@Composable
private fun Content() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Route.Wallet,
        enterTransition = {
            slideIntoContainer(towards = AnimatedContentTransitionScope.SlideDirection.Left)
        },
        exitTransition = {
            slideOutOfContainer(towards = AnimatedContentTransitionScope.SlideDirection.Right)
        },
        popEnterTransition = {
            slideIntoContainer(towards = AnimatedContentTransitionScope.SlideDirection.Right)
        },
        popExitTransition = {
            slideOutOfContainer(towards = AnimatedContentTransitionScope.SlideDirection.Left)
        },
    ) {
        walletRoute(navController = navController)
    }
}

@Preview
@Composable
fun GreetingPreview() {
    WalletWeDriveTheme {
        Content()
    }
}