package uz.futuresoft.features.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import uz.futuresoft.common.R
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
    val state by viewModel.state.collectAsStateWithLifecycle()

    AddNewCardScreenContent(
        state = state,
        intent = { intent ->
            when (intent) {
                AddNewCardIntent.GoBack -> navController.popBackStack()
                else -> Unit
            }
            viewModel.handleIntent(intent)
        }
    )
}

@Composable
private fun AddNewCardScreenContent(
    state: AddNewCardState,
    intent: (AddNewCardIntent) -> Unit,
) {
    val context = LocalContext.current
    val snackBarHostState = remember { SnackbarHostState() }
    var focusedField by remember { mutableStateOf<CardField?>(null) }

    LaunchedEffect(key1 = state.error) {
        state.error?.getContentIfNotHandled()
            ?.let { snackBarHostState.showSnackbar(message = it.asString(context)) }
    }

    LaunchedEffect(key1 = state.successMessage) {
        state.successMessage?.getContentIfNotHandled()?.let {
            snackBarHostState.showSnackbar(message = it.asString(context))
            intent(AddNewCardIntent.GoBack)
        }
    }

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
                cardNumber = state.cardNumber,
                cardExpireDate = state.cardExpireDate,
                onFieldFocused = { focusedField = it }
            )
            Button(
                onClick = {
                    intent(
                        AddNewCardIntent.SubmitCard(
                            cardNumber = state.cardNumber,
                            cardExpireDate = state.cardExpireDate
                        )
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 84.dp, bottom = 50.dp),
                enabled = (state.cardNumber.isNotEmpty() && state.cardNumber.length == 16) && (state.cardExpireDate.isNotEmpty() && state.cardExpireDate.length == 4),
                shape = RoundedCornerShape(12.dp),
            ) {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    if (state.loading) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(34.dp),
                            color = MaterialTheme.colorScheme.onPrimary,
                        )
                    } else {
                        Text(
                            text = stringResource(R.string.save),
                            modifier = Modifier.padding(vertical = 8.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onPrimary,
                        )
                    }
                }
            }
            CustomKeyboard(
                onInputDigit = {
                    intent(AddNewCardIntent.OnInputDigit(digit = it, focusedField = focusedField))
                },
                onRemoveDigit = {
                    intent(AddNewCardIntent.OnRemoveDigit(focusedField = focusedField))
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
            state = AddNewCardState(),
            intent = {},
        )
    }
}