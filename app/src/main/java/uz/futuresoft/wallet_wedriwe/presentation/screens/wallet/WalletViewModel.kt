package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.futuresoft.data.utils.ApiError
import uz.futuresoft.domain.repository.WalletRepository
import uz.futuresoft.domain.utils.Result

class WalletViewModel(
    private val walletRepository: WalletRepository,
) : ViewModel() {
    private val _walletState = MutableStateFlow(WalletState())
    val walletState: StateFlow<WalletState> = _walletState.asStateFlow()

    fun handleIntent(intent: WalletIntent) {
        when (intent) {
            WalletIntent.GetWalletInfo -> getWalletInfo()
        }
    }

    private fun getWalletInfo() {
        _walletState.update { it.copy(loading = true) }
        viewModelScope.launch {
            when (val result = walletRepository.getWalletInfo()) {
                is Result.Success -> _walletState.update {
                    it.copy(
                        loading = false,
                        error = "no error, everything is ok"
                    )
                }

                is Result.Error -> _walletState.update {
                    it.copy(
                        loading = false,
                        error = when (result.error) {
                            ApiError.CLIENT_ERROR -> "CLIENT_ERROR"
                            ApiError.SERVER_ERROR -> "SERVER_ERROR"
                            ApiError.NETWORK_ERROR -> "NETWORK_ERROR"
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