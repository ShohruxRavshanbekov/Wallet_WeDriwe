package uz.futuresoft.wallet_wedriwe.data.remote.apis.promoCodeApi

import io.ktor.client.HttpClient
import uz.futuresoft.wallet_wedriwe.data.network.dto.PromoCodeRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.PromoCodeResponse

class PromoCodeServiceImpl(
    private val client: HttpClient
) : PromoCodeService {
    override suspend fun addPromoCode(promoCode: PromoCodeRequest): PromoCodeResponse {
        TODO("Not yet implemented")
    }
}