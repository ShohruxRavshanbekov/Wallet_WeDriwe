package uz.futuresoft.domain.models

data class Wallet(
    val id: Int,
    val balance: Double,
    val phone: String,
    val activeMethod: String,
    val activeCardId: Int?,
)