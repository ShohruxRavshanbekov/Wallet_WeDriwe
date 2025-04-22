package uz.futuresoft.wallet_wedriwe.presentation.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.futuresoft.wallet_wedriwe.presentation.screens.wallet.WalletViewModel

val uiModule = module {
    viewModel { WalletViewModel(walletRepository = get()) }
}