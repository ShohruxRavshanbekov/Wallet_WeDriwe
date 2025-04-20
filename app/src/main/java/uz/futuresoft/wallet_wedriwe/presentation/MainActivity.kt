package uz.futuresoft.wallet_wedriwe.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.compose.koinViewModel
import uz.futuresoft.wallet_wedriwe.presentation.navigation.Screen
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
        startDestination = Screen.Wallet,
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
        composable<Screen.Wallet> {
            WalletScreen(
                navController = navController,
                viewModel = koinViewModel<WalletViewModel>(),
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