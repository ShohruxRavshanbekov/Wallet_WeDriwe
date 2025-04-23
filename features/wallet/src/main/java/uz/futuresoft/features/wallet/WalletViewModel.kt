package uz.futuresoft.features.wallet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.futuresoft.domain.models.PaymentMethod
import uz.futuresoft.domain.repository.PromoCodeRepository
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.usecases.GetWalletInfoUseCase
import uz.futuresoft.domain.utils.ApiError
import uz.futuresoft.domain.utils.onError
import uz.futuresoft.domain.utils.onSuccess
import uz.futuresoft.features.wallet.utils.toUi

class WalletViewModel(
    private val promoCodeRepository: PromoCodeRepository,
    private val walletRepository: WalletRepository,
    private val getWalletInfoUseCase: GetWalletInfoUseCase,
) : ViewModel() {
    private val _walletState = MutableStateFlow(WalletState())
    val walletState: StateFlow<WalletState> = _walletState.asStateFlow()

    fun handleIntent(intent: WalletIntent) {
        when (intent) {
            WalletIntent.GetWalletInfo -> getWalletInfo()
            is WalletIntent.SubmitPromoCode -> submitPromoCode(code = intent.code)
            is WalletIntent.ChangePaymentMethod -> changePaymentMethod(paymentMethod = intent.method)
        }
    }

    private fun getWalletInfo() {
        _walletState.update { it.copy(loading = true) }
        viewModelScope.launch {
            getWalletInfoUseCase()
                .onSuccess { walletInfo ->
                    _walletState.update {
                        it.copy(loading = false, walletInfo = walletInfo.toUi())
                    }
                }
                .onError { error ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            error = when (error) {
                                ApiError.CLIENT_ERROR -> "CLIENT_ERROR"
                                ApiError.SERVER_ERROR -> "SERVER_ERROR"
                                ApiError.NETWORK_ERROR -> "NETWORK_ERROR"
                                ApiError.TIME_OUT_ERROR -> "TIME_OUT_ERROR"
                                ApiError.NO_INTERNET_CONNECTION -> "NO_INTERNET_CONNECTION"
                                ApiError.UNKNOWN -> "UNKNOWN"
                                else -> "unknown error type"
                            }
                        )
                    }
                }
        }
    }

    private fun submitPromoCode(code: String) {
        _walletState.update { it.copy(loading = true) }
        viewModelScope.launch {
            promoCodeRepository.addPromoCode(promoCode = code)
                .onSuccess { successMessage ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            successMessage = successMessage,
                        )
                    }
                }
                .onError { error ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            error = when (error) {
                                ApiError.CLIENT_ERROR -> "CLIENT_ERROR"
                                ApiError.SERVER_ERROR -> "SERVER_ERROR"
                                ApiError.NETWORK_ERROR -> "NETWORK_ERROR"
                                ApiError.TIME_OUT_ERROR -> "TIME_OUT_ERROR"
                                ApiError.NO_INTERNET_CONNECTION -> "NO_INTERNET_CONNECTION"
                                ApiError.UNKNOWN -> "UNKNOWN"
                                else -> "unknown error type"
                            }
                        )
                    }
                }
        }
    }

    private fun changePaymentMethod(paymentMethod: PaymentMethod) {
        _walletState.update { it.copy(loading = true) }
        viewModelScope.launch {
            walletRepository.updatePaymentMethod(paymentMethod = paymentMethod)
                .onSuccess { walletInfo ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            walletInfo = walletInfo,
                            successMessage = "Successfully changed",
                        )
                    }
                }
                .onError { error ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            error = when (error) {
                                ApiError.CLIENT_ERROR -> "CLIENT_ERROR"
                                ApiError.SERVER_ERROR -> "SERVER_ERROR"
                                ApiError.NETWORK_ERROR -> "NETWORK_ERROR"
                                ApiError.TIME_OUT_ERROR -> "TIME_OUT_ERROR"
                                ApiError.NO_INTERNET_CONNECTION -> "NO_INTERNET_CONNECTION"
                                ApiError.UNKNOWN -> "UNKNOWN"
                                else -> "unknown error type"
                            }
                        )
                    }
                }
        }
    }
}