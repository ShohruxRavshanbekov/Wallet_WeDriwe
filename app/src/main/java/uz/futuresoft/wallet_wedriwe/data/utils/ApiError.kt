package uz.futuresoft.wallet_wedriwe.data.utils

import uz.futuresoft.wallet_wedriwe.utils.Error

enum class ApiError : Error {
    CLIENT_ERROR,
    SERVER_ERROR,
    NO_INTERNET_CONNECTION,
    UNKNOWN,
}