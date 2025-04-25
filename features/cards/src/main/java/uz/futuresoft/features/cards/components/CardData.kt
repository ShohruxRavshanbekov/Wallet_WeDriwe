package uz.futuresoft.features.cards.components

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.R
import uz.futuresoft.common.ui.theme.CardDataTextColor
import uz.futuresoft.common.ui.theme.CardDataTextContainerBorderColor
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.cards.utils.visual_transformation.CardExpiryDateMask
import uz.futuresoft.features.cards.utils.visual_transformation.CardNumberMask

@Composable
internal fun CardData(
    cardNumber: String,
    cardExpireDate: String,
    onCardNumberChange: (String) -> Unit,
    onCardExpireDateChange: (String) -> Unit,
    onCardNumberFieldFocused: () -> Unit,
    onCardExpireDateFieldFocused: () -> Unit,
) {
    OutlinedCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 2.dp, color = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
                .padding(top = 50.dp, bottom = 16.dp, start = 20.dp, end = 20.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
        ) {
            CustomOutlinedTextField(
                value = cardNumber,
                onValueChange = onCardNumberChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                textStyle = MaterialTheme.typography.bodyMedium.copy(color = CardDataTextColor),
                shape = RoundedCornerShape(14.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = CardDataTextContainerBorderColor.copy(alpha = 0.3f),
                    focusedBorderColor = CardDataTextContainerBorderColor.copy(alpha = 0.3f)
                ),
                contentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                placeholder = {
                    Text(
                        text = "0000 0000 0000 0000",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Gray,
                    )
                },
                visualTransformation = CardNumberMask(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next,
                ),
            )
            CustomOutlinedTextField(
                value = cardExpireDate,
                onValueChange = onCardExpireDateChange,
                customWidth = ("00/00".length * 8).dp,
                singleLine = true,
                textStyle =
                    MaterialTheme.typography.bodyMedium.copy(color = CardDataTextColor),
                shape = RoundedCornerShape(14.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = CardDataTextContainerBorderColor.copy(alpha = 0.3f),
                    focusedBorderColor = CardDataTextContainerBorderColor.copy(alpha = 0.3f)
                ),
                contentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
                placeholder = {
                    Text(
                        text = "00/00",
                        style = MaterialTheme.typography.bodyMedium.copy(textAlign = TextAlign.Center),
                        color = Color.Gray,
                    )
                },
                visualTransformation = CardExpiryDateMask(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done,
                ),
            )
        }
    }
}

@Preview
@Composable
private fun CardDataPreview() {
    WalletWeDriveTheme {
        CardData(
            cardNumber = "",
            cardExpireDate = "",
            onCardNumberChange = {},
            onCardExpireDateChange = {},
            onCardNumberFieldFocused = {},
            onCardExpireDateFieldFocused = {},
        )
    }
}