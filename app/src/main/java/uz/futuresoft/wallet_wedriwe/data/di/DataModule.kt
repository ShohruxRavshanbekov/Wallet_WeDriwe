package uz.futuresoft.wallet_wedriwe.data.di

import org.koin.dsl.module
import uz.futuresoft.wallet_wedriwe.data.remote.KtorClient
import uz.futuresoft.wallet_wedriwe.data.remote.apis.cardsApi.CardsService
import uz.futuresoft.wallet_wedriwe.data.remote.apis.cardsApi.CardsServiceImpl
import uz.futuresoft.wallet_wedriwe.data.remote.apis.promoCodeApi.PromoCodeService
import uz.futuresoft.wallet_wedriwe.data.remote.apis.promoCodeApi.PromoCodeServiceImpl
import uz.futuresoft.wallet_wedriwe.data.remote.apis.walletApi.WalletApi
import uz.futuresoft.wallet_wedriwe.data.remote.apis.walletApi.WalletApiImpl

val dataModule = module {
    single { KtorClient.create() }
    single<WalletApi> { WalletApiImpl(client = get()) }
    single<CardsService> { CardsServiceImpl(client = get()) }
    single<PromoCodeService> { PromoCodeServiceImpl(client = get()) }
}