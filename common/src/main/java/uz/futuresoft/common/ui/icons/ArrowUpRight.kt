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

val AppIcons.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "ArrowUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0C0C0C))) {
                moveTo(16.51f, 6.88f)
                curveTo(16.39f, 6.829f, 16.261f, 6.802f, 16.13f, 6.8f)
                horizontalLineTo(7.74f)
                curveTo(7.475f, 6.8f, 7.22f, 6.905f, 7.033f, 7.093f)
                curveTo(6.845f, 7.28f, 6.74f, 7.535f, 6.74f, 7.8f)
                curveTo(6.74f, 8.065f, 6.845f, 8.32f, 7.033f, 8.507f)
                curveTo(7.22f, 8.695f, 7.475f, 8.8f, 7.74f, 8.8f)
                horizontalLineTo(13.74f)
                lineTo(7f, 15.49f)
                curveTo(6.814f, 15.677f, 6.709f, 15.931f, 6.709f, 16.195f)
                curveTo(6.709f, 16.459f, 6.814f, 16.713f, 7f, 16.9f)
                curveTo(7.187f, 17.086f, 7.441f, 17.191f, 7.705f, 17.191f)
                curveTo(7.969f, 17.191f, 8.223f, 17.086f, 8.41f, 16.9f)
                lineTo(15.1f, 10.22f)
                verticalLineTo(16.22f)
                curveTo(15.1f, 16.485f, 15.205f, 16.74f, 15.393f, 16.927f)
                curveTo(15.58f, 17.115f, 15.835f, 17.22f, 16.1f, 17.22f)
                curveTo(16.365f, 17.22f, 16.62f, 17.115f, 16.807f, 16.927f)
                curveTo(16.995f, 16.74f, 17.1f, 16.485f, 17.1f, 16.22f)
                verticalLineTo(7.8f)
                curveTo(17.099f, 7.603f, 17.04f, 7.41f, 16.929f, 7.246f)
                curveTo(16.819f, 7.082f, 16.663f, 6.955f, 16.48f, 6.88f)
                horizontalLineTo(16.51f)
                close()
            }
        }.build()

        return _ArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowUpRightPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.ArrowUpRight, contentDescription = null)
        }
    }
}