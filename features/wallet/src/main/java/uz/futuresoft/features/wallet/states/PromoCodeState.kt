package uz.futuresoft.features.wallet.states

import uz.futuresoft.common.utils.Event
import uz.futuresoft.common.utils.UiText

data class PromoCodeState(
    val loading: Boolean = false,
    val successMessage: Event<UiText>? = null,
    val error: Event<UiText>? = null
)
