package uz.futuresoft.wallet_wedriwe.data.remote.services.promoCodeService

import uz.futuresoft.wallet_wedriwe.data.remote.dto.PromoCodeRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.PromoCodeResponse

interface PromoCodeService {
    suspend fun addPromoCode(promoCode: PromoCodeRequest): PromoCodeResponse
}