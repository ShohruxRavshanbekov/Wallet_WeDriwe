package uz.futuresoft.features.wallet.utils

import uz.futuresoft.domain.models.Card
import uz.futuresoft.domain.models.WalletInfo
import uz.futuresoft.features.wallet.models.CardUi
import uz.futuresoft.features.wallet.models.PaymentMethodUi
import uz.futuresoft.features.wallet.models.WalletUi
import uz.futuresoft.domain.models.PaymentMethod as DomainPaymentMethod

fun WalletInfo.toUi(): WalletUi {
    return WalletUi(
        balance = this.balance,
        activeMethod = if (this.activeMethod == "cash") PaymentMethod.CASH else PaymentMethod.CARD,
        activeCardId = this.activeCardId,
        cards = this.cards.map { it.toUi() },
    )
}

fun Card.toUi(): CardUi {
    return CardUi(
        id = this.id,
        number = this.number,
    )
}

fun PaymentMethodUi.toDomain(): DomainPaymentMethod {
    return DomainPaymentMethod(
        activeMethod = when (this.activeMethod) {
            PaymentMethod.CASH -> "cash"
            PaymentMethod.CARD -> "card"
            else -> ""
        },
        activeCardId = this.activeCardId,
    )
}