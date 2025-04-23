package uz.futuresoft.data.utils

import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result

inline fun <A, B, E : Error, R> Result<A, E>.zip(
    other: Result<B, E>,
    transform: (A, B) -> R,
): Result<R, E> {
    return when (this) {
        is Result.Success -> when (other) {
            is Result.Success -> Result.Success(transform(this.data, other.data))
            is Result.Error -> other
        }

        is Result.Error -> this
    }
}