package uz.futuresoft.wallet_wedriwe.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class PromoCodeRequest(
    val code: String
)