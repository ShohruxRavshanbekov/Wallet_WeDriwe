package uz.futuresoft.features.cards.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import uz.futuresoft.common.ui.theme.FigTreeFontFamily
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
internal fun NumberItem(
    number: String,
    onClick: () -> Unit,
) {
    TextButton(onClick = onClick) {
        Text(
            text = number,
            style = TextStyle(
                color = MaterialTheme.colorScheme.primary,
                fontFamily = FigTreeFontFamily,
                fontWeight = FontWeight.W400,
                fontSize = 36.sp,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NumberItemPreview() {
    WalletWeDriveTheme {
        NumberItem(
            number = "1",
            onClick = {}
        )
    }
}