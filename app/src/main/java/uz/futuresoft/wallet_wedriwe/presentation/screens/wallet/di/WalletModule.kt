package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.futuresoft.wallet_wedriwe.presentation.screens.wallet.WalletViewModel

val walletModule = module {
    viewModel { WalletViewModel() }
}