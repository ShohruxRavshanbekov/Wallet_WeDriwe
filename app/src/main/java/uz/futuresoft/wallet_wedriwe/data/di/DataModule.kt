package uz.futuresoft.wallet_wedriwe.data.di

import org.koin.dsl.module
import uz.futuresoft.wallet_wedriwe.data.remote.KtorClient
import uz.futuresoft.wallet_wedriwe.data.remote.services.cardsService.CardsService
import uz.futuresoft.wallet_wedriwe.data.remote.services.cardsService.CardsServiceImpl
import uz.futuresoft.wallet_wedriwe.data.remote.services.promoCodeService.PromoCodeService
import uz.futuresoft.wallet_wedriwe.data.remote.services.promoCodeService.PromoCodeServiceImpl
import uz.futuresoft.wallet_wedriwe.data.remote.services.walletService.WalletService
import uz.futuresoft.wallet_wedriwe.data.remote.services.walletService.WalletServiceImpl

val dataModule = module {
    single { KtorClient.create() }
    single<WalletService> { WalletServiceImpl(client = get()) }
    single<CardsService> { CardsServiceImpl(client = get()) }
    single<PromoCodeService> { PromoCodeServiceImpl(client = get()) }
}