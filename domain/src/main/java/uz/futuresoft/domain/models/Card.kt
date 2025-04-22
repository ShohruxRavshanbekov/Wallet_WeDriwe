package uz.futuresoft.domain.models

data class Card(
    val id: Int,
    val number: String,
    val expireDate: String,
    val userId: Int,
)