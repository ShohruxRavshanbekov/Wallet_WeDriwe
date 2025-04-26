package uz.futuresoft.features.cards

import uz.futuresoft.common.utils.Event
import uz.futuresoft.common.utils.UiText

data class AddNewCardState(
    val loading: Boolean = false,
    val successMessage: Event<UiText>? = null,
    val error: Event<UiText>? = null,
    val cardNumber: String = "",
    val cardExpireDate: String = "",
)