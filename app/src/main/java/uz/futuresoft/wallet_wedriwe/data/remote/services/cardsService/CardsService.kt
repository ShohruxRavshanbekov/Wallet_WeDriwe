package uz.futuresoft.wallet_wedriwe.data.remote.services.cardsService

import uz.futuresoft.wallet_wedriwe.data.remote.dto.CardRequest
import uz.futuresoft.wallet_wedriwe.data.remote.dto.CardResponse

interface CardsService {
    suspend fun getCards(): List<CardResponse>
    suspend fun addNewCard(card: CardRequest): CardResponse
}