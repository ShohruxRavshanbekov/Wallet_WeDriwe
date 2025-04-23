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

val AppIcons.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) {
            return _ChevronRight!!
        }
        _ChevronRight = ImageVector.Builder(
            name = "ChevronRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF61636E))) {
                moveTo(10.34f, 19f)
                curveTo(10.141f, 19.001f, 9.947f, 18.943f, 9.781f, 18.833f)
                curveTo(9.616f, 18.723f, 9.487f, 18.567f, 9.411f, 18.383f)
                curveTo(9.335f, 18.2f, 9.315f, 17.998f, 9.354f, 17.803f)
                curveTo(9.393f, 17.609f, 9.489f, 17.43f, 9.63f, 17.29f)
                lineTo(14.85f, 12f)
                lineTo(9.63f, 6.83f)
                curveTo(9.537f, 6.737f, 9.463f, 6.626f, 9.412f, 6.504f)
                curveTo(9.362f, 6.382f, 9.336f, 6.252f, 9.336f, 6.12f)
                curveTo(9.336f, 5.988f, 9.362f, 5.858f, 9.412f, 5.736f)
                curveTo(9.463f, 5.614f, 9.537f, 5.503f, 9.63f, 5.41f)
                curveTo(9.723f, 5.317f, 9.834f, 5.243f, 9.956f, 5.192f)
                curveTo(10.078f, 5.142f, 10.208f, 5.116f, 10.34f, 5.116f)
                curveTo(10.472f, 5.116f, 10.602f, 5.142f, 10.724f, 5.192f)
                curveTo(10.846f, 5.243f, 10.957f, 5.317f, 11.05f, 5.41f)
                lineTo(17f, 11.34f)
                curveTo(17.186f, 11.527f, 17.291f, 11.781f, 17.291f, 12.045f)
                curveTo(17.291f, 12.309f, 17.186f, 12.563f, 17f, 12.75f)
                lineTo(11.08f, 18.67f)
                curveTo(10.986f, 18.774f, 10.872f, 18.857f, 10.745f, 18.913f)
                curveTo(10.618f, 18.97f, 10.48f, 19f, 10.34f, 19f)
                close()
            }
        }.build()

        return _ChevronRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRight: ImageVector? = null

@Preview
@Composable
private fun ChevronRightPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.ChevronRight, contentDescription = null)
        }
    }
}