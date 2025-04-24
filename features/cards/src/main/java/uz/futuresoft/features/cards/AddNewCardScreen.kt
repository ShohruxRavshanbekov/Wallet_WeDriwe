@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.features.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uz.futuresoft.common.components.CircleIconButton
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.ArrowLeft
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.cards.components.AddNewCardTopAppBar
import uz.futuresoft.features.cards.components.CardData

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
    val snackBarHostState = remember { SnackbarHostState() }

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
            CardData()
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