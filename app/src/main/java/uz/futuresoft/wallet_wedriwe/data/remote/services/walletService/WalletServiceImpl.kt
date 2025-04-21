package uz.futuresoft.wallet_wedriwe.data.remote.services.walletService

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.request.put
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.URLProtocol
import io.ktor.http.appendPathSegments
import io.ktor.http.contentType
import io.ktor.http.headersOf
import io.ktor.http.path
import uz.futuresoft.wallet_wedriwe.data.remote.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.WalletResponse

class WalletServiceImpl(
    private val client: HttpClient,
) : WalletService {
    override suspend fun getWalletInfo(): WalletResponse? {
        val response = client.get("/wallet")
        return response.body()
    }

    override suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): WalletResponse? {
        val response = client.put("/wallet/method") {
            setBody(paymentMethod)
        }
        return response.body()
    }
}