package uz.futuresoft.features.wallet.utils

import uz.futuresoft.common.R.string
import uz.futuresoft.common.utils.UiText
import uz.futuresoft.domain.utils.ApiError

fun ApiError.asUiText(): UiText {
    return when (this) {
        ApiError.CLIENT_ERROR -> UiText.StringResource(string.client_error)
        ApiError.SERVER_ERROR -> UiText.StringResource(string.server_error)
        ApiError.NETWORK_ERROR -> UiText.StringResource(string.network_error)
        ApiError.TIME_OUT_ERROR -> UiText.StringResource(string.time_out_error)
        ApiError.NO_INTERNET_CONNECTION -> UiText.StringResource(string.no_internet_connection)
        ApiError.UNKNOWN -> UiText.StringResource(string.unknown_error)
    }
}