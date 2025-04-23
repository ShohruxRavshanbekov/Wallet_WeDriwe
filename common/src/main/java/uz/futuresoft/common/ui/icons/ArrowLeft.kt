package uz.futuresoft.common.ui.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

val AppIcons.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "ArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF202125))) {
                moveTo(17.82f, 11f)
                horizontalLineTo(8.36f)
                lineTo(12.59f, 6.77f)
                curveTo(12.719f, 6.576f, 12.776f, 6.342f, 12.751f, 6.11f)
                curveTo(12.726f, 5.878f, 12.621f, 5.662f, 12.454f, 5.5f)
                curveTo(12.286f, 5.337f, 12.068f, 5.238f, 11.835f, 5.22f)
                curveTo(11.602f, 5.202f, 11.371f, 5.265f, 11.18f, 5.4f)
                lineTo(5.24f, 11.34f)
                curveTo(5.083f, 11.524f, 4.998f, 11.758f, 5f, 12f)
                curveTo(5f, 12.134f, 5.028f, 12.267f, 5.08f, 12.39f)
                curveTo(5.129f, 12.509f, 5.2f, 12.618f, 5.29f, 12.71f)
                lineTo(11.23f, 18.65f)
                curveTo(11.418f, 18.837f, 11.673f, 18.941f, 11.939f, 18.941f)
                curveTo(12.204f, 18.94f, 12.458f, 18.833f, 12.645f, 18.645f)
                curveTo(12.832f, 18.457f, 12.936f, 18.202f, 12.936f, 17.937f)
                curveTo(12.935f, 17.671f, 12.828f, 17.417f, 12.64f, 17.23f)
                lineTo(8.36f, 13f)
                horizontalLineTo(17.82f)
                curveTo(18.085f, 13f, 18.34f, 12.895f, 18.527f, 12.707f)
                curveTo(18.715f, 12.52f, 18.82f, 12.265f, 18.82f, 12f)
                curveTo(18.82f, 11.735f, 18.715f, 11.48f, 18.527f, 11.293f)
                curveTo(18.34f, 11.105f, 18.085f, 11f, 17.82f, 11f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowLeftPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.ArrowLeft, contentDescription = null)
        }
    }
}