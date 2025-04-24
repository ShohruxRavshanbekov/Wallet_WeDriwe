package uz.futuresoft.features.cards

import androidx.lifecycle.ViewModel
import uz.futuresoft.domain.repository.CardsRepository

class AddNewCardViewModel(
    private val cardsRepository: CardsRepository,
) : ViewModel() {

    fun handleIntent(intent: AddNewCardIntent) {

    }

}