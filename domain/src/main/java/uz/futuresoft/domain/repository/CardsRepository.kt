package uz.futuresoft.domain.repository

import uz.futuresoft.domain.models.Card
import uz.futuresoft.domain.models.NewCard
import uz.futuresoft.domain.utils.Result
import uz.futuresoft.domain.utils.Error

interface CardsRepository {
    suspend fun getCards(): Result<List<Card>, Error>
    suspend fun addCard(card: NewCard): Result<Card, Error>

}