package uz.futuresoft.features.wallet

import uz.futuresoft.features.wallet.models.ActivePaymentMethod

sealed interface WalletIntent {
    data object GetWalletInfo : WalletIntent
    data object OpenAddNewCardScreen : WalletIntent
    data class ChangePaymentMethod(val method: ActivePaymentMethod) : WalletIntent
    data class SubmitPromoCode(val code: String) : WalletIntent
}