package uz.futuresoft.wallet_wedriwe.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CardResponse(
    val id: Int,
    val number: String,
    @SerialName("expire_date")
    val expireDate: String,
    @SerialName("user_id")
    val userId: Int,
)