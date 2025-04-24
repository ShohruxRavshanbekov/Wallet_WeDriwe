package uz.futuresoft.features.wallet.states

import uz.futuresoft.common.utils.UiText

data class PromoCodeState(
    val loading: Boolean = false,
    val successMessage: UiText? = null,
    val error: UiText? = null
)
