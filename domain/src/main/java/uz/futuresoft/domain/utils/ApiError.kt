package uz.futuresoft.domain.utils

enum class ApiError : Error {
    CLIENT_ERROR,
    SERVER_ERROR,
    NETWORK_ERROR,
    TIME_OUT_ERROR,
    NO_INTERNET_CONNECTION,
    UNKNOWN,
}