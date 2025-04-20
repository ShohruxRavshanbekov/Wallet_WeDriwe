package uz.futuresoft.wallet_wedriwe.data.remote.services.cardsService

import io.ktor.client.HttpClient
import uz.futuresoft.wallet_wedriwe.data.remote.dto.CardRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.CardResponse

class CardsServiceImpl(
    private val client: HttpClient,
) : CardsService {
    override suspend fun getCards(): List<CardResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun addNewCard(card: CardRequest): CardResponse {
        TODO("Not yet implemented")
    }
}