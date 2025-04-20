package uz.futuresoft.wallet_wedriwe.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PromoCodeRequest(
    val code: String
)