package uz.futuresoft.features.wallet.models

import uz.futuresoft.features.wallet.utils.PaymentMethod

data class WalletUi(
    val balance: Double = 0.0,
    val activeMethod: PaymentMethod = PaymentMethod.UNKNOWN,
    val activeCardId: Int? = null,
    val cards: List<CardUi> = emptyList(),
)