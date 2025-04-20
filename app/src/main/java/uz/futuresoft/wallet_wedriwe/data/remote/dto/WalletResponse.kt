package uz.futuresoft.wallet_wedriwe.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WalletResponse(
    val id: Int,
    val balance: Double,
    val phone: String,
    @SerialName("active_method")
    val activeMethod: String,
    @SerialName("active_card_id")
    val activeCardId: Int?,
)