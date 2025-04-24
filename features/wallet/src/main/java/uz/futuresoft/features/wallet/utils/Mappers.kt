package uz.futuresoft.features.wallet.utils

import uz.futuresoft.domain.models.Card
import uz.futuresoft.domain.models.Wallet
import uz.futuresoft.domain.models.WalletInfo
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.models.CardUi
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

fun WalletInfo.toActivePaymentMethod(): ActivePaymentMethod {
    return ActivePaymentMethod(
        cash = this.activeMethod == "cash",
        card = this.activeMethod == "card",
        cardId = if (this.activeMethod == "card") this.activeCardId else null,
    )
}

fun Wallet.toActivePaymentMethod(): ActivePaymentMethod {
    return ActivePaymentMethod(
        cash = this.activeMethod == "cash",
        card = this.activeMethod == "card",
        cardId = if (this.activeMethod == "card") this.activeCardId else null,
    )
}

fun Card.toUi(): CardUi {
    return CardUi(
        id = this.id,
        number = this.number,
    )
}

fun ActivePaymentMethod.toDomain(): DomainPaymentMethod {
    return DomainPaymentMethod(
        activeMethod = if (this.cash) "cash" else "card",
        activeCardId = this.cardId,
    )
}
