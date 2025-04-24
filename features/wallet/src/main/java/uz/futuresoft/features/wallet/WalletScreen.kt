@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.features.wallet

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.Card
import uz.futuresoft.common.ui.icons.Cash
import uz.futuresoft.common.ui.icons.NewCard
import uz.futuresoft.common.ui.icons.PromoCode
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.wallet.components.BalanceCard
import uz.futuresoft.features.wallet.components.IdentificationCard
import uz.futuresoft.features.wallet.components.IntentItem
import uz.futuresoft.features.wallet.components.PaymentMethodItem
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.utils.PaymentMethod

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
    val context = LocalContext.current
    val pullToRefreshState = rememberPullToRefreshState()
    val snackBarHostState = remember { SnackbarHostState() }

    LaunchedEffect(key1 = state.successMessage) {
        state.successMessage?.let { snackBarHostState.showSnackbar(message = it.asString(context)) }
    }

    LaunchedEffect(key1 = state.error) {
        state.error?.let { snackBarHostState.showSnackbar(message = it.asString(context)) }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Wallet",
                        style = MaterialTheme.typography.headlineLarge,
                        color = MaterialTheme.colorScheme.onSurface,
                    )
                },
            )
        },
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        containerColor = MaterialTheme.colorScheme.surface,
    ) { innerPadding ->
        PullToRefreshBox(
            isRefreshing = state.loading,
            onRefresh = { intent(WalletIntent.GetWalletInfo) },
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            state = pullToRefreshState,
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),
            ) {
                item {
                    BalanceCard(
                        balance = 0.0,
                        modifier = Modifier.padding(top = 8.dp, bottom = 12.dp)
                    )
                }
                item {
                    IdentificationCard(modifier = Modifier.padding(bottom = 6.dp))
                }
                item {
                    IntentItem(
                        icon = AppIcons.PromoCode,
                        title = "Add Promo code",
                        onClick = {}
                    )
                }
                item {
                    PaymentMethodItem(
                        icon = AppIcons.Cash,
                        title = "Cash",
                        selected = state.activePaymentMethod.cash,
                        onSelect = {
                            state.error
                            intent(
                                WalletIntent.ChangePaymentMethod(
                                    ActivePaymentMethod(
                                        cash = true,
                                        card = false,
                                        cardId = null
                                    )
                                )
                            )
                        },
                    )
                }
                items(state.walletInfo.cards) { card ->
                    PaymentMethodItem(
                        icon = AppIcons.Card,
                        title = "Card **** ${card.number.takeLast(4)}",
                        selected = state.activePaymentMethod.card && state.activePaymentMethod.cardId == card.id,
                        onSelect = {
                            intent(
                                WalletIntent.ChangePaymentMethod(
                                    ActivePaymentMethod(
                                        cash = false,
                                        card = true,
                                        cardId = card.id
                                    )
                                )
                            )
                        },
                    )
                }
                item {
                    IntentItem(
                        icon = AppIcons.NewCard,
                        title = "Add new card",
                        onClick = {}
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletWeDriveTheme {
        WalletScreenContent(
            state = WalletState(),
            intent = {},
        )
    }
}