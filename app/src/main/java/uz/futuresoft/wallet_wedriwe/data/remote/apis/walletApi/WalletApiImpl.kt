package uz.futuresoft.wallet_wedriwe.data.remote.apis.walletApi

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import kotlinx.io.IOException
import uz.futuresoft.wallet_wedriwe.data.network.dto.PaymentMethodRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.WalletResponse
import uz.futuresoft.wallet_wedriwe.data.utils.ApiError
import uz.futuresoft.wallet_wedriwe.utils.Result

class WalletApiImpl(
    private val client: HttpClient,
) : WalletApi {
    override suspend fun getWalletInfo(): Result<WalletResponse, ApiError> {
        return try {
            val response = client.get("/wallet")
            Result.Success(data = response.body())
        } catch (e: ClientRequestException) {
            Result.Error(error = ApiError.CLIENT_ERROR)
        } catch (e: ServerResponseException) {
            Result.Error(error = ApiError.SERVER_ERROR)
        } catch (e: IOException) {
            val response = client.get("/wallet")
            Log.d("AAAAA", "getWalletInfo: ${response.status}")
            Result.Error(error = ApiError.NO_INTERNET_CONNECTION)
        } catch (e: Exception) {
            Result.Error(error = ApiError.UNKNOWN)
        }
//        val response = client.get("/wallet")
//        return when (response.status.value) {
//            in 200..299 -> Result.Success(data = response.body())
//            in 400..499 -> Result.Error(error = ApiError.CLIENT_ERROR)
//            in 500..599 -> Result.Error(error = ApiError.SERVER_ERROR)
//            else -> Result.Error(error = ApiError.UNKNOWN)
//        }
    }

    override suspend fun updatePaymentMethod(paymentMethod: PaymentMethodRequest): Result<WalletResponse, ApiError> {
        return try {
            val response = client.put("/wallet/method") {
                setBody(paymentMethod)
            }
            Result.Success(data = response.body())
        } catch (e: ClientRequestException) {
            Result.Error(error = ApiError.CLIENT_ERROR)
        } catch (e: ServerResponseException) {
            Result.Error(error = ApiError.SERVER_ERROR)
        } catch (e: IOException) {
            Result.Error(error = ApiError.NO_INTERNET_CONNECTION)
        } catch (e: Exception) {
            Result.Error(error = ApiError.UNKNOWN)
        }
//        val response = client.put("/wallet/method") {
//            setBody(paymentMethod)
//        }
//        return when (response.status.value) {
//            in 200..299 -> Result.Success(data = response.body())
//            in 400..499 -> Result.Error(error = ApiError.CLIENT_ERROR)
//            in 500..599 -> Result.Error(error = ApiError.SERVER_ERROR)
//            else -> Result.Error(error = ApiError.UNKNOWN)
//        }
    }
}