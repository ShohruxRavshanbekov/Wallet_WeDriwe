package uz.futuresoft.features.cards.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.RemoveDigit
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
internal fun CustomKeyboard(
    onInput: (String) -> Unit,
    onClear: () -> Unit,
) {
    val numbers = remember {
        mutableStateListOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(count = 3),
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(numbers.drop(1)) { number ->
            NumberItem(
                number = number,
                onClick = { onInput(number) }
            )
        }
        item {
            NumberItem(
                number = "",
                onClick = {}
            )
        }
        item {
            NumberItem(
                number = numbers[0],
                onClick = { onInput(numbers[0]) }
            )
        }
        item {
            IconButton(onClick = onClear) {
                Icon(
                    imageVector = AppIcons.RemoveDigit,
                    contentDescription = null,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CustomKeyboardPreview() {
    WalletWeDriveTheme {
        CustomKeyboard(
            onInput = {},
            onClear = {},
        )
    }
}