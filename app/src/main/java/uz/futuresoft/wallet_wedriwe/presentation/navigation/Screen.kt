package uz.futuresoft.wallet_wedriwe.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {
    @Serializable
    data object Wallet : Screen

    @Serializable
    data object AddCard : Screen
}