package uz.futuresoft.features.wallet.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.PromoCode
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme
import uz.futuresoft.features.wallet.utils.PaymentMethod

@Composable
internal fun PaymentMethodItem(
    icon: ImageVector,
    title: String,
    selected: Boolean,
    onSelect: () -> Unit,
) {
    Card(
        onClick = onSelect,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.5.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = Color.Unspecified,
                )
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                )
            }
            CustomSwitch(
                checked = selected,
                onCheckedChange = { onSelect() },
            )
        }
    }
}

@Preview
@Composable
private fun PaymentMethodItemPreview() {
    WalletWeDriveTheme {
        PaymentMethodItem(
            icon = AppIcons.PromoCode,
            title = "Add Promo code",
            selected = false,
            onSelect = { },
        )
    }
}