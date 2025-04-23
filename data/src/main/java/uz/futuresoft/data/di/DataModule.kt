package uz.futuresoft.data.di

import org.koin.dsl.module
import uz.futuresoft.data.network.ApiClient
import uz.futuresoft.data.network.repository.CardsRepositoryImpl
import uz.futuresoft.data.network.repository.PromoCodeRepositoryImpl
import uz.futuresoft.data.network.repository.WalletRepositoryImpl
import uz.futuresoft.data.network.usecases.GetWalletInfoUseCaseImpl
import uz.futuresoft.domain.repository.CardsRepository
import uz.futuresoft.domain.repository.PromoCodeRepository
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.usecases.GetWalletInfoUseCase


val dataModule = module {
    single { ApiClient.create() }

    single<WalletRepository> { WalletRepositoryImpl(client = get()) }
    single<CardsRepository> { CardsRepositoryImpl(client = get()) }
    single<PromoCodeRepository> { PromoCodeRepositoryImpl(client = get()) }

    single<GetWalletInfoUseCase> {
        GetWalletInfoUseCaseImpl(walletRepository = get(), cardsRepository = get())
    }
}