package uz.futuresoft.domain.models

data class PaymentMethod(
    val activeMethod: String,
    val activeCardId: Int?,
)