package uz.futuresoft.features.wallet.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel
import uz.futuresoft.common.navigation.Route
import uz.futuresoft.features.wallet.WalletScreen
import uz.futuresoft.features.wallet.WalletViewModel

fun NavGraphBuilder.walletRoute(navController: NavHostController) {
    composable<Route.Wallet> {
        val viewModel = koinViewModel<WalletViewModel>()

        WalletScreen(
            navController = navController,
            viewModel = viewModel,
        )
    }
}