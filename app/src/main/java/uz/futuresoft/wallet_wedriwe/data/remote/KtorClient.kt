package uz.futuresoft.wallet_wedriwe.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json

object KtorClient {
    private const val BASE_URL = "https://wedrive-assignment-api.onrender.com"
    private const val ACCOUNT_PHONE = "+998906349564"

    fun create(): HttpClient {
        return HttpClient(Android) {
            install(Logging) { level = LogLevel.BODY }
            install(ContentNegotiation) { json() }

            defaultRequest {
                url(BASE_URL)
                contentType(type = ContentType.Application.Json)
                header(
                    key = "X-Account-Phone",
                    value = ACCOUNT_PHONE,
                )
            }
        }
    }
}