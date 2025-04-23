package uz.futuresoft.data.network.usecases

import uz.futuresoft.data.utils.zip
import uz.futuresoft.domain.models.WalletInfo
import uz.futuresoft.domain.repository.CardsRepository
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.usecases.GetWalletInfoUseCase
import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result

class GetWalletInfoUseCaseImpl(
    private val walletRepository: WalletRepository,
    private val cardsRepository: CardsRepository,
) : GetWalletInfoUseCase {
    override suspend operator fun invoke(): Result<WalletInfo, Error> {
        val walletRepository = walletRepository.getWalletInfo()
        val cardsRepository = cardsRepository.getCards()
        return walletRepository.zip(cardsRepository) { wallet, linkedCards ->
            WalletInfo(
                id = wallet.id,
                balance = wallet.balance,
                phone = wallet.phone,
                activeMethod = wallet.activeMethod,
                activeCardId = wallet.activeCardId,
                cards = linkedCards,
            )
        }
    }
}