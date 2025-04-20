package uz.futuresoft.wallet_wedriwe.data.remote.services.walletService

import io.ktor.client.HttpClient
import uz.futuresoft.wallet_wedriwe.data.remote.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.WalletResponse

class WalletServiceImpl(
    private val client: HttpClient,
) : WalletService {
    override suspend fun getWalletInfo(): WalletResponse {
        TODO("Not yet implemented")
    }

    override suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): WalletResponse {
        TODO("Not yet implemented")
    }
}