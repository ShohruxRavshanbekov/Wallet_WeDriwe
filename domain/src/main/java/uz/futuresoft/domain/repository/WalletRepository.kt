package uz.futuresoft.domain.repository

import uz.futuresoft.domain.models.PaymentMethod
import uz.futuresoft.domain.models.Wallet
import uz.futuresoft.domain.utils.Error
import uz.futuresoft.domain.utils.Result

interface WalletRepository {
    suspend fun getWalletInfo(): Result<Wallet, Error>
    suspend fun updatePaymentMethod(paymentMethod: PaymentMethod): Result<Wallet, Error>
}