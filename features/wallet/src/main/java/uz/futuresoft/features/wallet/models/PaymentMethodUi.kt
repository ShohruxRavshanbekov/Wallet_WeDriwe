package uz.futuresoft.features.wallet.models

import uz.futuresoft.features.wallet.utils.PaymentMethod

data class PaymentMethodUi(
    val activeMethod: PaymentMethod = PaymentMethod.UNKNOWN,
    val activeCardId: Int? = null,
)
