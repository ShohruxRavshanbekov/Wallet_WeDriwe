package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet

sealed interface WalletIntent {
    data object GetWalletInfo : WalletIntent
}