package uz.futuresoft.data.utils

import uz.futuresoft.data.network.dto.CardRequest
import uz.futuresoft.data.network.dto.CardResponse
import uz.futuresoft.data.network.dto.PaymentMethodRequest
import uz.futuresoft.data.network.dto.WalletResponse
import uz.futuresoft.domain.models.Card
import uz.futuresoft.domain.models.NewCard
import uz.futuresoft.domain.models.PaymentMethod
import uz.futuresoft.domain.models.Wallet

fun WalletResponse.toDomain(): Wallet {
    return Wallet(
        id = this.id,
        balance = this.balance,
        phone = this.phone,
        activeMethod = this.activeMethod,
        activeCardId = this.activeCardId,
    )
}

fun CardResponse.toDomain(): Card {
    return Card(
        id = this.id,
        number = this.number,
        expireDate = this.expireDate,
        userId = this.userId,
    )
}

fun PaymentMethod.toRequest(): PaymentMethodRequest {
    return PaymentMethodRequest(
        activeMethod = this.activeMethod,
        activeCardId = this.activeCardId,
    )
}

fun NewCard.toRequest(): CardRequest {
    return CardRequest(
        number = this.number,
        expireDate = this.expireDate,
    )
}
