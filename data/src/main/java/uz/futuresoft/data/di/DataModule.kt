package uz.futuresoft.data.di

import org.koin.dsl.module
import uz.futuresoft.data.network.ApiClient
import uz.futuresoft.data.network.repository.WalletRepositoryImpl
import uz.futuresoft.domain.repository.WalletRepository


val dataModule = module {
    single { ApiClient.create() }
    single<WalletRepository> { WalletRepositoryImpl(client = get()) }
}