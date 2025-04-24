@file:OptIn(ExperimentalMaterial3Api::class)

package uz.futuresoft.features.wallet.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.R.string
import uz.futuresoft.common.components.CircleIconButton
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.ArrowLeft
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.wallet.WalletIntent
import uz.futuresoft.features.wallet.states.PromoCodeState

@Composable
internal fun AddPromoCodeBottomSheet(
    promoCodeState: PromoCodeState,
    intent: (WalletIntent) -> Unit,
    sheetState: SheetState,
    onDismissRequest: () -> Unit,
) {
    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = sheetState,
        modifier = Modifier.fillMaxWidth(),
        dragHandle = null,
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
    ) {
        AddPromoCodeBottomSheetContent(
            promoCodeState = promoCodeState,
            intent = intent,
            onDismissRequest = onDismissRequest,
        )
    }
}

@Composable
private fun AddPromoCodeBottomSheetContent(
    promoCodeState: PromoCodeState,
    intent: (WalletIntent) -> Unit,
    onDismissRequest: () -> Unit,
) {
    var promoCode by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .imePadding(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CircleIconButton(
                icon = AppIcons.ArrowLeft,
                onClick = onDismissRequest,
            )
            Text(
                text = stringResource(string.enter_promo_code),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface,
            )
        }
        TextField(
            value = promoCode,
            onValueChange = { promoCode = it },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.SemiBold),
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
            ),
            placeholder = {
                Text(
                    text = stringResource(string.promo_code),
                    style = MaterialTheme.typography.headlineSmall,
                )
            },
            trailingIcon = {
                if (promoCode.isNotEmpty()) {
                    IconButton(onClick = { promoCode = "" }) {
                        Icon(imageVector = Icons.Rounded.Clear, contentDescription = null)
                    }
                }
            },
        )
        Button(
            onClick = { if (!promoCodeState.loading) intent(WalletIntent.SubmitPromoCode(code = promoCode)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = promoCode.isNotEmpty(),
            shape = RoundedCornerShape(12.dp),
        ) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                if (promoCodeState.loading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(34.dp),
                        color = MaterialTheme.colorScheme.onPrimary,
                    )
                } else {
                    Text(
                        text = stringResource(string.save),
                        modifier = Modifier.padding(vertical = 8.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AddPromoCodeBottomSheetPreview() {
    WalletWeDriveTheme {
        AddPromoCodeBottomSheetContent(
            promoCodeState = PromoCodeState(),
            intent = {},
            onDismissRequest = {},
        )
    }
}