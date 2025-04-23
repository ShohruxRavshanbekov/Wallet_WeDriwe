package uz.futuresoft.domain.utils

typealias RootError = Error

sealed interface Result<out D, out E : RootError> {
    data class Success<out D>(val data: D) : Result<D, Nothing>
    data class Error<out E : RootError>(val error: E) : Result<Nothing, E>
}

fun <D, E : RootError> Result<D, E>.onSuccess(action: (D) -> Unit): Result<D, E> {
    return when (this) {
        is Result.Success -> {
            action(this.data)
            this
        }

        else -> this
    }
}

fun <D, E : RootError> Result<D, E>.onError(action: (E) -> Unit): Result<D, E> {
    return when (this) {
        is Result.Error -> {
            action(this.error)
            this
        }

        else -> this
    }
}
