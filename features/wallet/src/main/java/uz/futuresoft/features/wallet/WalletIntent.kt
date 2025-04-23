package uz.futuresoft.features.wallet

import uz.futuresoft.domain.models.PaymentMethod

sealed interface WalletIntent {
    data object GetWalletInfo : WalletIntent
    data class ChangePaymentMethod(val method: PaymentMethod) : WalletIntent
    data class SubmitPromoCode(val code: String) : WalletIntent
}