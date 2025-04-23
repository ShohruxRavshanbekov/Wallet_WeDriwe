package uz.futuresoft.common.ui.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

val AppIcons.RemoveDigit: ImageVector
    get() {
        if (_RemoveDigit != null) {
            return _RemoveDigit!!
        }
        _RemoveDigit = ImageVector.Builder(
            name = "RemoveDigit",
            defaultWidth = 30.dp,
            defaultHeight = 18.dp,
            viewportWidth = 30f,
            viewportHeight = 18f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF202125)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(29f, 17f)
                verticalLineTo(1f)
                horizontalLineTo(7.222f)
                lineTo(1f, 9f)
                lineTo(7.222f, 17f)
                horizontalLineTo(29f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF202125)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(20f, 6f)
                lineTo(14f, 12f)
                moveTo(14f, 6f)
                lineTo(20f, 12f)
            }
        }.build()

        return _RemoveDigit!!
    }

@Suppress("ObjectPropertyName")
private var _RemoveDigit: ImageVector? = null

@Preview
@Composable
private fun RemoveDigitPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.RemoveDigit, contentDescription = null)
        }
    }
}