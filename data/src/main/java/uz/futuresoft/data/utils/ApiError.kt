package uz.futuresoft.data.utils

import uz.futuresoft.domain.utils.Error

enum class ApiError : Error {
    CLIENT_ERROR,
    SERVER_ERROR,
    NETWORK_ERROR,
    NO_INTERNET_CONNECTION,
    UNKNOWN,
}