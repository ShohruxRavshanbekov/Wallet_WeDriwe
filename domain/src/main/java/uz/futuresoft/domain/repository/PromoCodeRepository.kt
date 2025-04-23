package uz.futuresoft.domain.repository

import uz.futuresoft.domain.utils.Result
import uz.futuresoft.domain.utils.Error

interface PromoCodeRepository {
    suspend fun addPromoCode(promoCode: String): Result<String, Error>
}