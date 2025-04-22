package uz.futuresoft.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethodRequest(
    @SerialName("active_method")
    val activeMethod: String,
    @SerialName("active_card_id")
    val activeCardId: Int?,
)