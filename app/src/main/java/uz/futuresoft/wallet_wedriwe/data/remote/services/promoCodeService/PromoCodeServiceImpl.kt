package uz.futuresoft.wallet_wedriwe.data.remote.services.promoCodeService

import io.ktor.client.HttpClient
import uz.futuresoft.wallet_wedriwe.data.remote.dto.PromoCodeRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.PromoCodeResponse

class PromoCodeServiceImpl(
    private val client: HttpClient
) : PromoCodeService {
    override suspend fun addPromoCode(promoCode: PromoCodeRequest): PromoCodeResponse {
        TODO("Not yet implemented")
    }
}