package uz.futuresoft.wallet_wedriwe.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CardRequest(
    val number: String,
    @SerialName("expire_date")
    val expireDate: String,
)