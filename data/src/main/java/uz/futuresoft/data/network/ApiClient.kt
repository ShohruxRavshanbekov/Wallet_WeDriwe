package uz.futuresoft.data.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import uz.futuresoft.data.utils.CustomLogger

object ApiClient {
    private const val BASE_URL = "https://wedrive-assignment-api.onrender.com"
    private const val ACCOUNT_PHONE = "+998906349564"

    fun create(): HttpClient {
        return HttpClient(CIO) {
            install(ContentNegotiation) { json() }
            install(Logging) {
                logger = CustomLogger(tag = "Ktor")
                level = LogLevel.BODY
            }

            defaultRequest {
                url(BASE_URL)
                header(
                    key = "X-Account-Phone",
                    value = ACCOUNT_PHONE,
                )
            }
        }
    }
}