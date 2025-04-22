package uz.futuresoft.wallet_wedriwe.domain.repository

import uz.futuresoft.wallet_wedriwe.data.network.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.WalletResponse
import uz.futuresoft.wallet_wedriwe.data.utils.ApiError
import uz.futuresoft.wallet_wedriwe.utils.Result

interface WalletRepository {
    suspend fun getWalletInfo(): Result<WalletResponse, ApiError>
    suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): Result<WalletResponse, ApiError>
}