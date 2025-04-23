package uz.futuresoft.common.ui.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

val AppIcons.NewCard: ImageVector
    get() {
        if (_NewCard != null) {
            return _NewCard!!
        }
        _NewCard = ImageVector.Builder(
            name = "NewCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFEE45A),
                            1f to Color(0xFFFEA613)
                        ),
                        start = Offset(12f, 1.357f),
                        end = Offset(12f, 4.534f)
                    )
                ) {
                    moveTo(21.594f, 16.384f)
                    horizontalLineTo(2.406f)
                    curveTo(1.677f, 16.384f, 1.086f, 15.793f, 1.086f, 15.064f)
                    verticalLineTo(3.886f)
                    curveTo(1.086f, 3.157f, 1.677f, 2.566f, 2.406f, 2.566f)
                    horizontalLineTo(21.594f)
                    curveTo(22.323f, 2.566f, 22.914f, 3.157f, 22.914f, 3.886f)
                    verticalLineTo(15.064f)
                    curveTo(22.914f, 15.793f, 22.323f, 16.384f, 21.594f, 16.384f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF5A5A5A),
                            1f to Color(0xFF444444)
                        ),
                        start = Offset(8.595f, 4.554f),
                        end = Offset(16.887f, 25.132f)
                    )
                ) {
                    moveTo(22.328f, 21.434f)
                    horizontalLineTo(1.672f)
                    curveTo(0.749f, 21.434f, 0f, 20.685f, 0f, 19.761f)
                    verticalLineTo(6.247f)
                    curveTo(0f, 5.323f, 0.749f, 4.575f, 1.672f, 4.575f)
                    horizontalLineTo(22.328f)
                    curveTo(23.251f, 4.575f, 24f, 5.323f, 24f, 6.247f)
                    verticalLineTo(19.761f)
                    curveTo(24f, 20.685f, 23.251f, 21.434f, 22.328f, 21.434f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(12f, 17.698f),
                        end = Offset(12f, 21.585f)
                    )
                ) {
                    moveTo(0f, 15.244f)
                    verticalLineTo(19.761f)
                    curveTo(0f, 20.685f, 0.749f, 21.434f, 1.672f, 21.434f)
                    horizontalLineTo(22.328f)
                    curveTo(23.251f, 21.434f, 24f, 20.685f, 24f, 19.761f)
                    verticalLineTo(15.244f)
                    horizontalLineTo(0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A1A1A))) {
                    moveTo(16.182f, 18.34f)
                    horizontalLineTo(17.782f)
                    curveTo(17.977f, 18.34f, 18.135f, 18.498f, 18.135f, 18.692f)
                    curveTo(18.135f, 18.887f, 17.977f, 19.045f, 17.782f, 19.045f)
                    horizontalLineTo(16.182f)
                    curveTo(15.988f, 19.045f, 15.83f, 18.887f, 15.83f, 18.692f)
                    curveTo(15.83f, 18.498f, 15.988f, 18.34f, 16.182f, 18.34f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A1A1A))) {
                    moveTo(19.006f, 19.045f)
                    curveTo(18.811f, 19.045f, 18.653f, 18.887f, 18.653f, 18.692f)
                    curveTo(18.653f, 18.498f, 18.811f, 18.34f, 19.006f, 18.34f)
                    horizontalLineTo(19.406f)
                    curveTo(19.601f, 18.34f, 19.759f, 18.498f, 19.759f, 18.692f)
                    curveTo(19.759f, 18.887f, 19.601f, 19.045f, 19.406f, 19.045f)
                    horizontalLineTo(19.006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A1A1A))) {
                    moveTo(21.633f, 17.383f)
                    horizontalLineTo(16.182f)
                    curveTo(15.988f, 17.383f, 15.83f, 17.225f, 15.83f, 17.03f)
                    curveTo(15.83f, 16.835f, 15.988f, 16.677f, 16.182f, 16.677f)
                    horizontalLineTo(21.633f)
                    curveTo(21.828f, 16.677f, 21.986f, 16.835f, 21.986f, 17.03f)
                    curveTo(21.986f, 17.225f, 21.828f, 17.383f, 21.633f, 17.383f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFEDBBD),
                            1f to Color(0xFFFD3581)
                        ),
                        start = Offset(2.098f, 15.849f),
                        end = Offset(5.453f, 19.205f)
                    )
                ) {
                    moveTo(4.109f, 19.956f)
                    curveTo(5.266f, 19.956f, 6.205f, 19.018f, 6.205f, 17.861f)
                    curveTo(6.205f, 16.704f, 5.266f, 15.766f, 4.109f, 15.766f)
                    curveTo(2.952f, 15.766f, 2.014f, 16.704f, 2.014f, 17.861f)
                    curveTo(2.014f, 19.018f, 2.952f, 19.956f, 4.109f, 19.956f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(6.856f, -4.972f),
                        end = Offset(12.574f, 10.839f)
                    )
                ) {
                    moveTo(0f, 6.892f)
                    horizontalLineTo(24f)
                    verticalLineTo(11.611f)
                    horizontalLineTo(0f)
                    verticalLineTo(6.892f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFEAF6FF),
                            1f to Color(0xFFB3DAFE)
                        ),
                        start = Offset(2.014f, 13.894f),
                        end = Offset(10.722f, 13.894f)
                    )
                ) {
                    moveTo(9.723f, 14.892f)
                    horizontalLineTo(3.013f)
                    curveTo(2.461f, 14.892f, 2.014f, 14.445f, 2.014f, 13.894f)
                    curveTo(2.014f, 13.342f, 2.461f, 12.895f, 3.013f, 12.895f)
                    horizontalLineTo(9.723f)
                    curveTo(10.275f, 12.895f, 10.722f, 13.342f, 10.722f, 13.894f)
                    curveTo(10.722f, 14.445f, 10.275f, 14.892f, 9.723f, 14.892f)
                    close()
                }
            }
        }.build()

        return _NewCard!!
    }

@Suppress("ObjectPropertyName")
private var _NewCard: ImageVector? = null

@Preview
@Composable
private fun NewCardPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.NewCard, contentDescription = null, tint = Color.Unspecified)
        }
    }
}