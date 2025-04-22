package uz.futuresoft.wallet_wedriwe.data.remote.apis.cardsApi

import uz.futuresoft.wallet_wedriwe.data.network.dto.CardRequest
import uz.futuresoft.wallet_wedriwe.data.network.dto.CardResponse

interface CardsService {
    suspend fun getCards(): List<CardResponse>
    suspend fun addNewCard(card: CardRequest): CardResponse
}