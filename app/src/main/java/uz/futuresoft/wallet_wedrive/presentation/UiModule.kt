package uz.futuresoft.wallet_wedrive.presentation

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.futuresoft.features.cards.AddNewCardViewModel
import uz.futuresoft.features.wallet.WalletViewModel

val uiModule = module {
    viewModel { WalletViewModel(get(), get(), get()) }
    viewModel { AddNewCardViewModel(get()) }
}