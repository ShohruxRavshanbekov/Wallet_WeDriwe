package uz.futuresoft.features.wallet

import uz.futuresoft.domain.models.WalletInfo
import uz.futuresoft.features.wallet.models.WalletUi

data class WalletState(
    val loading: Boolean = false,
    val successMessage: String? = null,
    val error: String? = null,
    val walletInfo: WalletUi = WalletUi(),
)
