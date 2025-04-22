package uz.futuresoft.wallet_wedriwe.data.remote.apis.walletApi

import uz.futuresoft.wallet_wedriwe.data.network.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.WalletResponse
import uz.futuresoft.wallet_wedriwe.data.utils.ApiError
import uz.futuresoft.wallet_wedriwe.utils.Result

interface WalletApi {
    suspend fun getWalletInfo(): Result<WalletResponse, ApiError>
    suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): Result<WalletResponse, ApiError>
}