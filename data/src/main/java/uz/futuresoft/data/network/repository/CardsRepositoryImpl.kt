package uz.futuresoft.data.network.repository

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.io.IOException
import uz.futuresoft.data.network.dto.CardResponse
import uz.futuresoft.data.utils.toDomain
import uz.futuresoft.data.utils.toRequest
import uz.futuresoft.domain.models.Card
import uz.futuresoft.domain.models.NewCard
import uz.futuresoft.domain.repository.CardsRepository
import uz.futuresoft.domain.utils.ApiError
import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result
import java.net.ConnectException

class CardsRepositoryImpl(
    private val client: HttpClient,
) : CardsRepository {
    override suspend fun getCards(): Result<List<Card>, Error> {
        return try {
            val response = client.get("/cards")
            val linkedCards = response.body<List<CardResponse>>()
            Result.Success(data = linkedCards.map { it.toDomain() })
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

    override suspend fun addCard(card: NewCard): Result<Card, Error> {
        return try {
            val response = client.post("/cards") {
                contentType(ContentType.Application.Json)
                setBody(card.toRequest())
            }
            val linkedCard = response.body<CardResponse>()
            Result.Success(data = linkedCard.toDomain())
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