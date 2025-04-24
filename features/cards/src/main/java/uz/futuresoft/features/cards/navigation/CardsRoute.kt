package uz.futuresoft.features.cards.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel
import uz.futuresoft.common.navigation.Route
import uz.futuresoft.features.cards.AddNewCardScreen
import uz.futuresoft.features.cards.AddNewCardViewModel

fun NavGraphBuilder.cardsRoute(navController: NavHostController) {
    composable<Route.AddNewCard> {
        val viewModel = koinViewModel<AddNewCardViewModel>()

        AddNewCardScreen(
            navController = navController,
            viewModel = viewModel,
        )
    }
}