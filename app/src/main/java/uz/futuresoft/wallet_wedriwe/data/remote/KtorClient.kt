package uz.futuresoft.wallet_wedriwe.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json

object KtorClient {
    fun create(): HttpClient {
        return HttpClient(Android) {
            install(Logging) { level = LogLevel.BODY }
            install(ContentNegotiation) { json() }
        }
    }
}