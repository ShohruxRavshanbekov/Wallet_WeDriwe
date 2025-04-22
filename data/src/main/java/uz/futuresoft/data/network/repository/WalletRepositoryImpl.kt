package uz.futuresoft.data.network.repository

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.io.IOException
import uz.futuresoft.data.network.dto.WalletResponse
import uz.futuresoft.domain.models.PaymentMethod
import uz.futuresoft.domain.models.Wallet
import uz.futuresoft.data.utils.ApiError
import uz.futuresoft.data.utils.toDomain
import uz.futuresoft.data.utils.toRequest
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result
import java.net.ConnectException

class WalletRepositoryImpl(
    private val client: HttpClient,
) : WalletRepository {
    override suspend fun getWalletInfo(): Result<Wallet, Error> {
        return try {
            val response = client.get("/wallet")
            val walletDto = response.body<WalletResponse>()
            Result.Success(data = walletDto.toDomain())
        } catch (e: ClientRequestException) {
            Result.Error(error = ApiError.CLIENT_ERROR)
        } catch (e: ServerResponseException) {
            Result.Error(error = ApiError.SERVER_ERROR)
        } catch (e: ConnectException) {
            Result.Error(error = ApiError.NO_INTERNET_CONNECTION)
        } catch (e: IOException) {
            Result.Error(error = ApiError.NETWORK_ERROR)
        } catch (e: Exception) {
            Log.d("AAAAA", "getWalletInfo: ${e.message}")
            Result.Error(error = ApiError.UNKNOWN)
        }
    }

    override suspend fun updatePaymentMethod(paymentMethod: PaymentMethod): Result<Wallet, Error> {
        return try {
            val response = client.put("/wallet/method") {
                contentType(ContentType.Application.Json)
                setBody(paymentMethod.toRequest())
            }
            val walletDto = response.body<WalletResponse>()
            Result.Success(data = walletDto.toDomain())
        } catch (e: ClientRequestException) {
            Result.Error(error = ApiError.CLIENT_ERROR)
        } catch (e: ServerResponseException) {
            Result.Error(error = ApiError.SERVER_ERROR)
        } catch (e: ConnectException) {
            Result.Error(error = ApiError.NO_INTERNET_CONNECTION)
        } catch (e: IOException) {
            Result.Error(error = ApiError.NETWORK_ERROR)
        } catch (e: Exception) {
            Result.Error(error = ApiError.UNKNOWN)
        }
    }
}