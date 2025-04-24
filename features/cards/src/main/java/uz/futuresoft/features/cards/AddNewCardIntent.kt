package uz.futuresoft.features.cards

sealed interface AddNewCardIntent {
    data object GoBack : AddNewCardIntent
}