package uz.futuresoft.wallet_wedrive.presentation

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.futuresoft.features.wallet.WalletViewModel

val uiModule = module {
    viewModel {
        WalletViewModel(
            promoCodeRepository = get(),
            walletRepository = get(),
            getWalletInfoUseCase = get(),
        )
    }
}