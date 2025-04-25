@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.features.cards

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uz.futuresoft.common.R
import uz.futuresoft.common.components.CircleIconButton
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.ArrowLeft
import uz.futuresoft.common.ui.theme.CardDataTextColor
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.cards.components.AddNewCardTopAppBar
import uz.futuresoft.features.cards.components.CardData
import uz.futuresoft.features.cards.components.CustomKeyboard
import uz.futuresoft.features.cards.utils.CardField

@Composable
internal fun AddNewCardScreen(
    navController: NavHostController,
    viewModel: AddNewCardViewModel,
) {
    AddNewCardScreenContent(
        intent = { intent ->
            when (intent) {
                AddNewCardIntent.GoBack -> navController.popBackStack()
            }
            viewModel.handleIntent(intent)
        }
    )
}

@Composable
private fun AddNewCardScreenContent(
    intent: (AddNewCardIntent) -> Unit,
) {
    val context = LocalContext.current
    val view = LocalView.current
    val snackBarHostState = remember { SnackbarHostState() }
    var cardNumber by remember { mutableStateOf("") }
    var cardExpireDate by remember { mutableStateOf("") }

    var focusedField by remember { mutableStateOf<CardField?>(null) }

    var isCardNumberFieldFocused by remember { mutableStateOf(false) }
    var isCardExpireDateFieldFocused by remember { mutableStateOf(false) }

//    LaunchedEffect(key1 = walletState.error) {
//        walletState.error?.let { snackBarHostState.showSnackbar(message = it.asString(context)) }
//    }
//
//    LaunchedEffect(key1 = walletState.successMessage) {
//        walletState.successMessage?.let {
//            snackBarHostState.showSnackbar(message = it.asString(context))
//        }
//    }

    Scaffold(
        topBar = { AddNewCardTopAppBar(intent = intent) },
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        containerColor = MaterialTheme.colorScheme.surface,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    PaddingValues(
                        top = innerPadding.calculateTopPadding() + 8.dp,
                        bottom = innerPadding.calculateBottomPadding(),
                        start = innerPadding.calculateStartPadding(LayoutDirection.Ltr) + 20.dp,
                        end = innerPadding.calculateStartPadding(LayoutDirection.Ltr) + 20.dp,
                    )
                ),
        ) {
            CardData(
                cardNumber = cardNumber,
                cardExpireDate = cardExpireDate,
                onCardNumberChange = { if (it.length <= 16) cardNumber = it },
                onCardExpireDateChange = { if (it.length <= 4) cardExpireDate = it },
                onCardNumberFieldFocused = {
                    focusedField = CardField.NUMBER

                    val imm =
                        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.windowToken, 0)

//                    isCardNumberFieldFocused = true
//                    isCardExpireDateFieldFocused = false
                },
                onCardExpireDateFieldFocused = {
                    focusedField = CardField.EXPIRE_DATE

                    val imm =
                        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.windowToken, 0)
//                    isCardExpireDateFieldFocused = true
//                    isCardNumberFieldFocused = false
                },
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 84.dp, bottom = 50.dp),
                enabled = (cardNumber.isNotEmpty() && cardNumber.length == 16) && (cardExpireDate.isNotEmpty() && cardExpireDate.length == 4),
                shape = RoundedCornerShape(12.dp),
            ) {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Text(
                        text = stringResource(R.string.save),
                        modifier = Modifier.padding(vertical = 8.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onPrimary,
                    )
//                    if (promoCodeState.loading) {
//                        CircularProgressIndicator(
//                            modifier = Modifier.size(34.dp),
//                            color = MaterialTheme.colorScheme.onPrimary,
//                        )
//                    } else {
//                        Text(
//                            text = stringResource(R.string.save),
//                            modifier = Modifier.padding(vertical = 8.dp),
//                            style = MaterialTheme.typography.bodyLarge,
//                            color = MaterialTheme.colorScheme.onPrimary,
//                        )
//                    }
                }
            }
            CustomKeyboard(
                onInput = { number ->
                    when (focusedField) {
                        CardField.NUMBER -> if (cardNumber.length > 16) cardNumber += number
                        CardField.EXPIRE_DATE -> if (cardExpireDate.length < 4) cardExpireDate += number
                        null -> Unit
                    }

//                    if (isCardNumberFieldFocused && cardNumber.length < 16) {
//                        cardNumber += number
//                    } else if (isCardExpireDateFieldFocused && cardExpireDate.length < 4) {
//                        cardExpireDate += number
//                    }
                },
                onClear = {
                    when (focusedField) {
                        CardField.NUMBER -> if (cardNumber.isNotEmpty())
                            cardNumber = cardNumber.substring(0, cardNumber.length - 1)

                        CardField.EXPIRE_DATE -> if (cardExpireDate.isNotEmpty())
                            cardExpireDate = cardExpireDate.substring(0, cardExpireDate.length - 1)
                        null -> Unit
                    }

//                    if (isCardNumberFieldFocused && cardNumber.isNotEmpty()) {
//                        cardNumber = cardNumber.substring(0, cardNumber.length - 1)
//                    } else if (isCardExpireDateFieldFocused && cardExpireDate.isNotEmpty()) {
//                        cardExpireDate = cardExpireDate.substring(0, cardExpireDate.length - 1)
//                    }
                }
            )
        }
    }
}

@Preview
@Composable
private fun AddNewCardScreenPreview() {
    WalletWeDriveTheme {
        AddNewCardScreenContent(
            intent = {},
        )
    }
}