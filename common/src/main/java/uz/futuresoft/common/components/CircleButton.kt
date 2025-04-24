package uz.futuresoft.common.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.ArrowLeft
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
fun CircleIconButton(
    icon: ImageVector,
    onClick: () -> Unit,
) {
    Card(
        onClick = onClick,
        modifier = Modifier.size(44.dp),
        shape = CircleShape,
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview
@Composable
private fun CircleIconButtonPreview() {
    WalletWeDriveTheme {
        CircleIconButton(
            icon = AppIcons.ArrowLeft,
            onClick = {},
        )
    }
}