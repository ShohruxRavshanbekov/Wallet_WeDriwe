package uz.futuresoft.domain.models

data class WalletInfo(
    val id: Int,
    val balance: Double,
    val phone: String,
    val activeMethod: String,
    val activeCardId: Int?,
    val cards: List<Card>,
)