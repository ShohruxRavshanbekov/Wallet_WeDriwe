package uz.futuresoft.features.cards.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.components.CircleIconButton
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.ArrowLeft
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.cards.AddNewCardIntent

@Composable
internal fun AddNewCardTopAppBar(
    intent: (AddNewCardIntent) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .windowInsetsPadding(WindowInsets.statusBars)
            .padding(vertical = 10.dp, horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        CircleIconButton(
            icon = AppIcons.ArrowLeft,
            onClick = { intent(AddNewCardIntent.GoBack) }
        )
        Text(
            text = "Add Card",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onSurface,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AddNewCardTopAppBarPreview() {
    WalletWeDriveTheme {
        AddNewCardTopAppBar(intent = {})
    }
}