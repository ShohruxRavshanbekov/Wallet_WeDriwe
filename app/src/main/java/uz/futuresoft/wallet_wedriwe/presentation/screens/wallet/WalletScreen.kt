@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.wallet_wedriwe.presentation.screens.wallet

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import uz.futuresoft.wallet_wedriwe.presentation.ui.theme.WalletWeDriweTheme

@Composable
fun WalletScreen(
    navController: NavHostController,
    viewModel: WalletViewModel,
) {
    WalletScreenContent()
}

@Composable
private fun WalletScreenContent() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Wallet")
                }
            )
        }
    ) { innerPadding ->
        PullToRefreshBox(
            isRefreshing = false,
            onRefresh = {},
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            LazyColumn { }
        }
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletWeDriweTheme {
        WalletScreenContent()
    }
}