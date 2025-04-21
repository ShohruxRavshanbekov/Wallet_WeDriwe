package uz.futuresoft.wallet_wedriwe.data.remote.services.walletService

import uz.futuresoft.wallet_wedriwe.data.remote.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.WalletResponse

interface WalletService {
    suspend fun getWalletInfo(): WalletResponse?
    suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): WalletResponse?
}