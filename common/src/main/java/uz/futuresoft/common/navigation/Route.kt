package uz.futuresoft.common.navigation

import kotlinx.serialization.Serializable

object Route {
    @Serializable
    data object Wallet

    @Serializable
    data object AddNewCard
}