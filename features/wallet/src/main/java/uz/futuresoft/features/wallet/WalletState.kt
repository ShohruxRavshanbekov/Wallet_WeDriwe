package uz.futuresoft.features.wallet

import uz.futuresoft.common.utils.UiText
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.models.WalletUi

data class WalletState(
    val loading: Boolean = false,
    val successMessage: UiText? = null,
    val error: UiText? = null,
    val walletInfo: WalletUi = WalletUi(),
    val activePaymentMethod: ActivePaymentMethod = ActivePaymentMethod(),
)
