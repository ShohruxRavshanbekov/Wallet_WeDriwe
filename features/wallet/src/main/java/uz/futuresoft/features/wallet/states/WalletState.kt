package uz.futuresoft.features.wallet.states

import uz.futuresoft.common.utils.Event
import uz.futuresoft.common.utils.UiText
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.models.WalletUi

data class WalletState(
    val loading: Boolean = false,
    val successMessage: Event<UiText>? = null,
    val error: Event<UiText>? = null,
    val walletInfo: WalletUi = WalletUi(),
    val activePaymentMethod: ActivePaymentMethod = ActivePaymentMethod(),
)
