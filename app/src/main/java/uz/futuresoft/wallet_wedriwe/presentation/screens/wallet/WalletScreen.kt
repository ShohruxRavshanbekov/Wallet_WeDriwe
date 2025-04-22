@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import uz.futuresoft.wallet_wedriwe.presentation.ui.theme.WalletWeDriweTheme

@Composable
fun WalletScreen(
    navController: NavHostController,
    viewModel: WalletViewModel,
) {
    val walletState by viewModel.walletState.collectAsStateWithLifecycle()

    LaunchedEffect(key1 = Unit) {
        viewModel.handleIntent(WalletIntent.GetWalletInfo)
    }

    WalletScreenContent(
        state = walletState,
        intent = viewModel::handleIntent
    )
}

@Composable
private fun WalletScreenContent(
    state: WalletState,
    intent: (WalletIntent) -> Unit,
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Wallet") }) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center,
        ) {
            if (state.loading) {
                CircularProgressIndicator()
            } else {
                Text(text = state.error.toString())
            }
        }
//        PullToRefreshBox(
//            isRefreshing = false,
//            onRefresh = {},
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding),
//        ) {
//            LazyColumn { }
//        }
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletWeDriweTheme {
        WalletScreenContent(
            state = WalletState(),
            intent = {},
        )
    }
}