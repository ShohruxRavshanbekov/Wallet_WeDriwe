package uz.futuresoft.wallet_wedriwe.data.remote.apis.promoCodeApi

import uz.futuresoft.wallet_wedriwe.data.network.dto.PromoCodeRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.PromoCodeResponse

interface PromoCodeService {
    suspend fun addPromoCode(promoCode: PromoCodeRequest): PromoCodeResponse
}