package uz.futuresoft.data.network.repository

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.io.IOException
import uz.futuresoft.data.network.dto.PromoCodeRequest
import uz.futuresoft.data.network.dto.PromoCodeResponse
import uz.futuresoft.domain.repository.PromoCodeRepository
import uz.futuresoft.domain.utils.ApiError
import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result
import java.net.ConnectException

class PromoCodeRepositoryImpl(
    private val client: HttpClient,
) : PromoCodeRepository {
    override suspend fun addPromoCode(promoCode: String): Result<String, Error> {
        return try {
            val response = client.post("/promocode") {
                contentType(ContentType.Application.Json)
                setBody(PromoCodeRequest(code = promoCode))
            }
            val successResponse = response.body<PromoCodeResponse>()
            Result.Success(data = successResponse.message)
        } catch (e: ClientRequestException) {
            Result.Error(error = ApiError.CLIENT_ERROR)
        } catch (e: ServerResponseException) {
            Result.Error(error = ApiError.SERVER_ERROR)
        } catch (e: HttpRequestTimeoutException) {
            Result.Error(error = ApiError.TIME_OUT_ERROR)
        } catch (e: ConnectException) {
            Result.Error(error = ApiError.NO_INTERNET_CONNECTION)
        } catch (e: IOException) {
            Result.Error(error = ApiError.NETWORK_ERROR)
        } catch (e: Exception) {
            Result.Error(error = ApiError.UNKNOWN)
        }
    }
}