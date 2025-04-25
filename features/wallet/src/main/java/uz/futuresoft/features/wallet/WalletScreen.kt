@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.features.wallet

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
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import uz.futuresoft.common.R.string
import uz.futuresoft.common.navigation.Route
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.Card
import uz.futuresoft.common.ui.icons.Cash
import uz.futuresoft.common.ui.icons.NewCard
import uz.futuresoft.common.ui.icons.PromoCode
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.wallet.components.AddPromoCodeBottomSheet
import uz.futuresoft.features.wallet.components.BalanceCard
import uz.futuresoft.features.wallet.components.IdentificationCard
import uz.futuresoft.features.wallet.components.IntentItem
import uz.futuresoft.features.wallet.components.PaymentMethodItem
import uz.futuresoft.features.wallet.models.ActivePaymentMethod
import uz.futuresoft.features.wallet.states.PromoCodeState
import uz.futuresoft.features.wallet.states.WalletState

@Composable
internal fun WalletScreen(
    navController: NavHostController,
    viewModel: WalletViewModel,
) {
    val walletState by viewModel.walletState.collectAsStateWithLifecycle()
    val promoCodeState by viewModel.promoCodeState.collectAsStateWithLifecycle()

    LaunchedEffect(key1 = Unit) {
        viewModel.handleIntent(WalletIntent.GetWalletInfo)
    }

    WalletScreenContent(
        walletState = walletState,
        promoCodeState = promoCodeState,
        intent = { intent ->
            when (intent) {
                WalletIntent.OpenAddNewCardScreen -> navController.navigate(Route.AddNewCard)
                else -> Unit
            }
            viewModel.handleIntent(intent)
        }
    )
}

@Composable
private fun WalletScreenContent(
    walletState: WalletState,
    promoCodeState: PromoCodeState,
    intent: (WalletIntent) -> Unit,
) {
    val context = LocalContext.current
    val pullToRefreshState = rememberPullToRefreshState()
    val snackBarHostState = remember { SnackbarHostState() }
    val addPromoCodeBottomSheet = rememberModalBottomSheetState()
    var showAddPromoCodeBottomSheet by remember { mutableStateOf(false) }

    LaunchedEffect(key1 = walletState.error) {
        walletState.error?.getContentIfNotHandled()?.let {
            snackBarHostState.showSnackbar(
                message = it.asString(context)
            )
        }
    }

    LaunchedEffect(key1 = promoCodeState.error) {
        promoCodeState.error?.getContentIfNotHandled()
            ?.let { snackBarHostState.showSnackbar(message = it.asString(context)) }
    }

    LaunchedEffect(key1 = walletState.successMessage) {
        walletState.successMessage?.getContentIfNotHandled()?.let {
            snackBarHostState.showSnackbar(message = it.asString(context))
        }
    }

    LaunchedEffect(key1 = promoCodeState.successMessage) {
        if (promoCodeState.successMessage != null) {
            showAddPromoCodeBottomSheet = false
            promoCodeState.successMessage.getContentIfNotHandled()?.let {
                snackBarHostState.showSnackbar(message = it.asString(context))
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(string.wallet),
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
            isRefreshing = walletState.loading,
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
                        title = stringResource(string.add_promo_code),
                        onClick = { showAddPromoCodeBottomSheet = true }
                    )
                }
                item {
                    PaymentMethodItem(
                        icon = AppIcons.Cash,
                        title = stringResource(string.cash),
                        selected = walletState.activePaymentMethod.cash,
                        onSelect = {
                            walletState.error
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
                items(walletState.walletInfo.cards) { card ->
                    PaymentMethodItem(
                        icon = AppIcons.Card,
                        title = stringResource(string.card, card.number.takeLast(4)),
                        selected = walletState.activePaymentMethod.card && walletState.activePaymentMethod.cardId == card.id,
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
                        title = stringResource(string.add_new_card),
                        onClick = { intent(WalletIntent.OpenAddNewCardScreen) }
                    )
                }
            }

            if (showAddPromoCodeBottomSheet) {
                AddPromoCodeBottomSheet(
                    promoCodeState = promoCodeState,
                    intent = intent,
                    sheetState = addPromoCodeBottomSheet,
                    onDismissRequest = { showAddPromoCodeBottomSheet = false },
                )
            }
        }
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletWeDriveTheme {
        WalletScreenContent(
            walletState = WalletState(),
            promoCodeState = PromoCodeState(),
            intent = {},
        )
    }
}