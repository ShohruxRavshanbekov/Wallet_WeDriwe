package uz.futuresoft.domain.usecases

import uz.futuresoft.domain.models.WalletInfo
import uz.futuresoft.domain.utils.Result
import uz.futuresoft.domain.utils.Error

interface GetWalletInfoUseCase {
    suspend operator fun invoke(): Result<WalletInfo, Error>
}