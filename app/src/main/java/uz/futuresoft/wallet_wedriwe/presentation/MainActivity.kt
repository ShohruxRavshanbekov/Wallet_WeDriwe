package uz.futuresoft.wallet_wedriwe.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.compose.koinViewModel
import uz.futuresoft.wallet_wedriwe.presentation.navigation.Route
import uz.futuresoft.wallet_wedriwe.presentation.screens.wallet.WalletScreen
import uz.futuresoft.wallet_wedriwe.presentation.screens.wallet.WalletViewModel
import uz.futuresoft.wallet_wedriwe.presentation.ui.theme.WalletWeDriweTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WalletWeDriweTheme {
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
        composable<Route.Wallet> {
            val viewModel = koinViewModel<WalletViewModel>()

            WalletScreen(
                navController = navController,
                viewModel = viewModel,
            )
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
    WalletWeDriweTheme {
        Content()
    }
}