package uz.futuresoft.features.wallet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.futuresoft.common.R.string
import uz.futuresoft.common.utils.Event
import uz.futuresoft.common.utils.UiText
import uz.futuresoft.domain.repository.PromoCodeRepository
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.usecases.GetWalletInfoUseCase
import uz.futuresoft.domain.utils.ApiError
import uz.futuresoft.domain.utils.onError
import uz.futuresoft.domain.utils.onSuccess
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.models.WalletUi
import uz.futuresoft.features.wallet.states.PromoCodeState
import uz.futuresoft.features.wallet.states.WalletState
import uz.futuresoft.features.wallet.utils.PaymentMethod.CARD
import uz.futuresoft.features.wallet.utils.PaymentMethod.CASH
import uz.futuresoft.features.wallet.utils.asUiText
import uz.futuresoft.features.wallet.utils.toActivePaymentMethod
import uz.futuresoft.features.wallet.utils.toDomain
import uz.futuresoft.features.wallet.utils.toUi

class WalletViewModel(
    private val promoCodeRepository: PromoCodeRepository,
    private val walletRepository: WalletRepository,
    private val getWalletInfoUseCase: GetWalletInfoUseCase,
) : ViewModel() {
    private val _walletState = MutableStateFlow(WalletState())
    val walletState: StateFlow<WalletState> = _walletState.asStateFlow()

    private val _promoCodeState = MutableStateFlow(PromoCodeState())
    val promoCodeState: StateFlow<PromoCodeState> = _promoCodeState.asStateFlow()

    fun handleIntent(intent: WalletIntent) {
        when (intent) {
            WalletIntent.GetWalletInfo -> getWalletInfo()
            is WalletIntent.SubmitPromoCode -> submitPromoCode(code = intent.code)
            is WalletIntent.ChangePaymentMethod -> changePaymentMethod(paymentMethod = intent.method)
            else -> Unit
        }
    }

    private fun getWalletInfo() {
        _walletState.update { it.copy(loading = true) }
        viewModelScope.launch {
            getWalletInfoUseCase()
                .onSuccess { walletInfo ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            walletInfo = walletInfo.toUi(),
                            activePaymentMethod = walletInfo.toActivePaymentMethod(),
                        )
                    }
                }
                .onError { error ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            error = Event(content = (error as ApiError).asUiText())
                        )
                    }
                }
        }
    }

    private fun submitPromoCode(code: String) {
        _promoCodeState.update { it.copy(loading = true) }
        viewModelScope.launch {
            promoCodeRepository.addPromoCode(promoCode = code)
                .onSuccess { successMessage ->
                    _promoCodeState.update {
                        it.copy(
                            loading = false,
                            successMessage = Event(content = UiText.DynamicString(successMessage)),
                        )
                    }
                }
                .onError { error ->
                    _promoCodeState.update {
                        it.copy(
                            loading = false,
                            error = Event(content = (error as ApiError).asUiText())
                        )
                    }
                }
        }
    }

    private fun changePaymentMethod(paymentMethod: ActivePaymentMethod) {
        _walletState.update { it.copy(loading = true, activePaymentMethod = paymentMethod) }
        viewModelScope.launch {
            walletRepository.updatePaymentMethod(paymentMethod = paymentMethod.toDomain())
                .onSuccess { wallet ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            walletInfo = WalletUi(
                                balance = wallet.balance,
                                activeMethod = if (wallet.activeMethod == "cash") CASH else CARD,
                                activeCardId = wallet.activeCardId,
                                cards = it.walletInfo.cards,
                            ),
                            activePaymentMethod = wallet.toActivePaymentMethod(),
                            successMessage = Event(content = UiText.StringResource(string.successfully_changed)),
                        )
                    }
                }
                .onError { error ->
                    _walletState.update {
                        it.copy(
                            loading = false,
                            successMessage = null,
                            error = Event(content = (error as ApiError).asUiText())
                        )
                    }
                }
        }
    }
}