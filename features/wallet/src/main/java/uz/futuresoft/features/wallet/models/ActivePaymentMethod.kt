package uz.futuresoft.features.wallet.models

data class ActivePaymentMethod(
    val cash: Boolean = false,
    val card: Boolean = false,
    val cardId: Int? = null,

)
