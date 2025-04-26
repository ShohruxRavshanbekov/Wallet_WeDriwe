package uz.futuresoft.features.cards

import uz.futuresoft.features.cards.utils.CardField

sealed interface AddNewCardIntent {
    data object GoBack : AddNewCardIntent
    data class OnInputDigit(val digit: String, val focusedField: CardField?) : AddNewCardIntent
    data class OnRemoveDigit(val focusedField: CardField?) : AddNewCardIntent
    data class SubmitCard(val cardNumber: String, val cardExpireDate: String) : AddNewCardIntent
}