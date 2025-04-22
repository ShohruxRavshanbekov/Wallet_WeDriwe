package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import uz.futuresoft.wallet_wedriwe.data.remote.apis.walletApi.WalletApi
import uz.futuresoft.wallet_wedriwe.data.utils.ApiError
import uz.futuresoft.wallet_wedriwe.utils.Result

class WalletViewModel(
    private val walletApi: WalletApi
) : ViewModel() {
//    init {
//        viewModelScope.launch {
//            when (val result = walletApi.getWalletInfo()) {
//                is Result.Success -> {
//                    Log.d("AAAAA", "WalletViewModel: ${result.data}")
//                }
//
//                is Result.Error -> {
//                    when (result.error) {
//                        ApiError.CLIENT_ERROR -> {
//                            Log.d("AAAAA", "WalletViewModel-Error: CLIENT_ERROR")
//                        }
//
//                        ApiError.SERVER_ERROR -> {
//                            Log.d("AAAAA", "WalletViewModel-Error: SERVER_ERROR")
//                        }
//
//                        ApiError.NO_INTERNET_CONNECTION -> {
//                            Log.d("AAAAA", "WalletViewModel-Error: NO_INTERNET_CONNECTION")
//                        }
//
//                        ApiError.UNKNOWN -> {
//                            Log.d("AAAAA", "WalletViewModel-Error: UNKNOWN")
//                        }
//                    }
//                }
//            }
//        }
//    }
}