package uz.futuresoft.data.utils

import uz.futuresoft.data.network.dto.PaymentMethodRequest
import uz.futuresoft.data.network.dto.WalletResponse
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

fun PaymentMethod.toRequest(): PaymentMethodRequest {
    return PaymentMethodRequest(
        activeMethod = this.activeMethod,
        activeCardId = this.activeCardId,
    )
}