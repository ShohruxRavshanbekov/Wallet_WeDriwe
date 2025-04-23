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

val AppIcons.Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
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
                            0f to Color(0xFFD5EFC8),
                            1f to Color(0xFF68CA44)
                        ),
                        start = Offset(8.379f, 8.956f),
                        end = Offset(11.232f, 22.448f)
                    )
                ) {
                    moveTo(19.049f, 8.716f)
                    curveTo(12.898f, 5.797f, 6.739f, 11.743f, 0.588f, 9.126f)
                    curveTo(0.309f, 9.007f, 0f, 9.208f, 0f, 9.511f)
                    verticalLineTo(20.874f)
                    curveTo(0f, 21.056f, 0.104f, 21.223f, 0.268f, 21.301f)
                    curveTo(6.419f, 24.22f, 12.578f, 18.274f, 18.729f, 20.891f)
                    curveTo(19.007f, 21.01f, 19.317f, 20.808f, 19.317f, 20.505f)
                    verticalLineTo(9.143f)
                    curveTo(19.317f, 8.961f, 19.213f, 8.794f, 19.049f, 8.716f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(9.872f, 18.115f),
                        end = Offset(10.566f, 21.97f)
                    )
                ) {
                    moveTo(0f, 12.942f)
                    verticalLineTo(20.874f)
                    curveTo(0f, 21.056f, 0.104f, 21.223f, 0.268f, 21.301f)
                    curveTo(6.419f, 24.22f, 12.578f, 18.274f, 18.729f, 20.891f)
                    curveTo(19.007f, 21.01f, 19.317f, 20.808f, 19.317f, 20.505f)
                    verticalLineTo(12.942f)
                    horizontalLineTo(0f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(16.954f, 14.407f),
                        end = Offset(19.652f, 14.407f)
                    )
                ) {
                    moveTo(19.049f, 8.716f)
                    curveTo(16.455f, 7.485f, 13.861f, 7.83f, 11.266f, 8.445f)
                    verticalLineTo(20.764f)
                    curveTo(13.754f, 20.175f, 16.242f, 19.833f, 18.729f, 20.891f)
                    curveTo(19.007f, 21.01f, 19.317f, 20.808f, 19.317f, 20.506f)
                    verticalLineTo(9.143f)
                    curveTo(19.317f, 8.961f, 19.213f, 8.794f, 19.049f, 8.716f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(4.709f, 1.637f),
                        end = Offset(13.068f, 24.22f)
                    )
                ) {
                    moveTo(17.933f, 11.785f)
                    curveTo(17.502f, 11.828f, 17.055f, 11.704f, 16.696f, 11.405f)
                    curveTo(16.14f, 10.94f, 15.962f, 10.191f, 16.198f, 9.547f)
                    curveTo(16.248f, 9.411f, 16.165f, 9.262f, 16.022f, 9.238f)
                    curveTo(11.836f, 8.558f, 7.647f, 11.219f, 3.461f, 10.625f)
                    curveTo(3.335f, 10.608f, 3.221f, 10.697f, 3.202f, 10.824f)
                    curveTo(3.144f, 11.215f, 2.948f, 11.588f, 2.621f, 11.861f)
                    curveTo(2.262f, 12.161f, 1.815f, 12.284f, 1.384f, 12.241f)
                    curveTo(1.25f, 12.228f, 1.134f, 12.335f, 1.134f, 12.47f)
                    verticalLineTo(18.003f)
                    curveTo(1.134f, 18.138f, 1.25f, 18.245f, 1.384f, 18.232f)
                    curveTo(1.815f, 18.189f, 2.262f, 18.313f, 2.621f, 18.612f)
                    curveTo(3.177f, 19.077f, 3.355f, 19.826f, 3.119f, 20.47f)
                    curveTo(3.069f, 20.606f, 3.152f, 20.755f, 3.295f, 20.778f)
                    curveTo(7.481f, 21.459f, 11.67f, 18.798f, 15.856f, 19.391f)
                    curveTo(15.982f, 19.409f, 16.096f, 19.319f, 16.115f, 19.193f)
                    curveTo(16.173f, 18.801f, 16.369f, 18.429f, 16.696f, 18.156f)
                    curveTo(17.055f, 17.856f, 17.502f, 17.733f, 17.933f, 17.775f)
                    curveTo(18.067f, 17.788f, 18.183f, 17.682f, 18.183f, 17.547f)
                    verticalLineTo(12.014f)
                    curveTo(18.183f, 11.878f, 18.067f, 11.772f, 17.933f, 11.785f)
                    close()
                    moveTo(9.658f, 18.9f)
                    curveTo(7.509f, 18.9f, 5.767f, 17.157f, 5.767f, 15.008f)
                    curveTo(5.767f, 12.859f, 7.509f, 11.117f, 9.658f, 11.117f)
                    curveTo(11.807f, 11.117f, 13.55f, 12.859f, 13.55f, 15.008f)
                    curveTo(13.55f, 17.157f, 11.807f, 18.9f, 9.658f, 18.9f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(12.524f, 21.578f),
                        end = Offset(12.19f, 18.737f)
                    )
                ) {
                    moveTo(18.729f, 20.891f)
                    curveTo(19.007f, 21.01f, 19.317f, 20.808f, 19.317f, 20.505f)
                    verticalLineTo(16.864f)
                    horizontalLineTo(6.673f)
                    lineTo(4.839f, 18.698f)
                    lineTo(7.776f, 21.636f)
                    curveTo(11.427f, 20.8f, 15.079f, 19.338f, 18.729f, 20.891f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF003CC0))) {
                    moveTo(2.486f, 15.198f)
                    lineTo(5.031f, 17.743f)
                    verticalLineTo(15.198f)
                    horizontalLineTo(2.486f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFD5EFC8),
                            1f to Color(0xFF68CA44)
                        ),
                        start = Offset(13.062f, 6.429f),
                        end = Offset(15.915f, 19.921f)
                    )
                ) {
                    moveTo(23.732f, 6.189f)
                    curveTo(17.581f, 3.27f, 11.422f, 9.216f, 5.271f, 6.599f)
                    curveTo(4.993f, 6.48f, 4.683f, 6.681f, 4.683f, 6.984f)
                    verticalLineTo(18.347f)
                    curveTo(4.683f, 18.529f, 4.787f, 18.696f, 4.951f, 18.774f)
                    curveTo(11.102f, 21.693f, 17.261f, 15.747f, 23.412f, 18.364f)
                    curveTo(23.691f, 18.483f, 24f, 18.281f, 24f, 17.979f)
                    verticalLineTo(6.616f)
                    curveTo(24f, 6.434f, 23.896f, 6.267f, 23.732f, 6.189f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(14.555f, 15.588f),
                        end = Offset(15.249f, 19.443f)
                    )
                ) {
                    moveTo(4.683f, 10.415f)
                    verticalLineTo(18.347f)
                    curveTo(4.683f, 18.529f, 4.787f, 18.696f, 4.951f, 18.774f)
                    curveTo(11.102f, 21.693f, 17.261f, 15.747f, 23.412f, 18.364f)
                    curveTo(23.691f, 18.483f, 24f, 18.281f, 24f, 17.979f)
                    verticalLineTo(10.415f)
                    horizontalLineTo(4.683f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(21.637f, 11.88f),
                        end = Offset(24.335f, 11.88f)
                    )
                ) {
                    moveTo(23.732f, 6.189f)
                    curveTo(21.138f, 4.958f, 18.544f, 5.303f, 15.949f, 5.918f)
                    verticalLineTo(18.237f)
                    curveTo(18.437f, 17.648f, 20.925f, 17.306f, 23.412f, 18.364f)
                    curveTo(23.691f, 18.483f, 24f, 18.281f, 24f, 17.979f)
                    verticalLineTo(6.616f)
                    curveTo(24f, 6.434f, 23.896f, 6.267f, 23.732f, 6.189f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(9.392f, -0.89f),
                        end = Offset(17.751f, 21.693f)
                    )
                ) {
                    moveTo(22.616f, 9.258f)
                    curveTo(22.185f, 9.301f, 21.738f, 9.177f, 21.379f, 8.878f)
                    curveTo(20.823f, 8.413f, 20.645f, 7.664f, 20.881f, 7.02f)
                    curveTo(20.931f, 6.884f, 20.848f, 6.735f, 20.705f, 6.712f)
                    curveTo(16.519f, 6.031f, 12.33f, 8.692f, 8.144f, 8.099f)
                    curveTo(8.018f, 8.081f, 7.904f, 8.171f, 7.885f, 8.297f)
                    curveTo(7.828f, 8.689f, 7.631f, 9.061f, 7.304f, 9.334f)
                    curveTo(6.945f, 9.634f, 6.498f, 9.757f, 6.067f, 9.714f)
                    curveTo(5.933f, 9.701f, 5.818f, 9.808f, 5.818f, 9.943f)
                    verticalLineTo(15.476f)
                    curveTo(5.818f, 15.611f, 5.933f, 15.718f, 6.067f, 15.705f)
                    curveTo(6.498f, 15.662f, 6.945f, 15.786f, 7.304f, 16.085f)
                    curveTo(7.86f, 16.55f, 8.038f, 17.299f, 7.802f, 17.943f)
                    curveTo(7.752f, 18.079f, 7.835f, 18.228f, 7.978f, 18.251f)
                    curveTo(12.164f, 18.932f, 16.353f, 16.271f, 20.539f, 16.864f)
                    curveTo(20.665f, 16.882f, 20.779f, 16.792f, 20.798f, 16.666f)
                    curveTo(20.856f, 16.274f, 21.052f, 15.902f, 21.379f, 15.629f)
                    curveTo(21.738f, 15.329f, 22.185f, 15.206f, 22.616f, 15.249f)
                    curveTo(22.75f, 15.262f, 22.866f, 15.155f, 22.866f, 15.02f)
                    verticalLineTo(9.487f)
                    curveTo(22.866f, 9.352f, 22.75f, 9.245f, 22.616f, 9.258f)
                    close()
                    moveTo(14.342f, 16.373f)
                    curveTo(12.193f, 16.373f, 10.45f, 14.63f, 10.45f, 12.481f)
                    curveTo(10.45f, 10.333f, 12.193f, 8.59f, 14.342f, 8.59f)
                    curveTo(16.49f, 8.59f, 18.233f, 10.333f, 18.233f, 12.481f)
                    curveTo(18.233f, 14.63f, 16.49f, 16.373f, 14.342f, 16.373f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(16.296f, 15.991f),
                        end = Offset(13.021f, 10.109f)
                    )
                ) {
                    moveTo(23.732f, 6.189f)
                    curveTo(17.581f, 3.27f, 11.422f, 9.216f, 5.271f, 6.599f)
                    curveTo(4.993f, 6.48f, 4.683f, 6.681f, 4.683f, 6.984f)
                    verticalLineTo(18.347f)
                    curveTo(4.683f, 18.529f, 4.787f, 18.696f, 4.951f, 18.774f)
                    curveTo(11.102f, 21.693f, 17.261f, 15.747f, 23.412f, 18.364f)
                    curveTo(23.691f, 18.483f, 24f, 18.281f, 24f, 17.979f)
                    verticalLineTo(6.616f)
                    curveTo(24f, 6.434f, 23.896f, 6.267f, 23.732f, 6.189f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FFFFFF),
                            1f to Color(0xFFFFFFFF)
                        ),
                        start = Offset(14.598f, 17.479f),
                        end = Offset(14.732f, 20.085f)
                    )
                ) {
                    moveTo(23.732f, 6.189f)
                    curveTo(17.581f, 3.27f, 11.422f, 9.216f, 5.271f, 6.599f)
                    curveTo(4.993f, 6.48f, 4.683f, 6.681f, 4.683f, 6.984f)
                    verticalLineTo(18.347f)
                    curveTo(4.683f, 18.529f, 4.787f, 18.696f, 4.951f, 18.774f)
                    curveTo(11.102f, 21.693f, 17.261f, 15.747f, 23.412f, 18.364f)
                    curveTo(23.691f, 18.483f, 24f, 18.281f, 24f, 17.979f)
                    verticalLineTo(6.616f)
                    curveTo(24f, 6.434f, 23.896f, 6.267f, 23.732f, 6.189f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFD5EFC8),
                            1f to Color(0xFF68CA44)
                        ),
                        start = Offset(10.72f, 2.939f),
                        end = Offset(13.573f, 16.431f)
                    )
                ) {
                    moveTo(21.39f, 2.699f)
                    curveTo(15.239f, -0.22f, 9.081f, 5.726f, 2.93f, 3.109f)
                    curveTo(2.651f, 2.99f, 2.342f, 3.192f, 2.342f, 3.494f)
                    verticalLineTo(14.857f)
                    curveTo(2.342f, 15.039f, 2.445f, 15.206f, 2.61f, 15.284f)
                    curveTo(8.761f, 18.203f, 14.919f, 12.257f, 21.07f, 14.874f)
                    curveTo(21.349f, 14.993f, 21.658f, 14.792f, 21.658f, 14.489f)
                    verticalLineTo(3.126f)
                    curveTo(21.659f, 2.944f, 21.555f, 2.777f, 21.39f, 2.699f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(12.213f, 12.098f),
                        end = Offset(12.907f, 15.953f)
                    )
                ) {
                    moveTo(2.342f, 6.925f)
                    verticalLineTo(14.857f)
                    curveTo(2.342f, 15.039f, 2.445f, 15.206f, 2.61f, 15.284f)
                    curveTo(8.761f, 18.203f, 14.919f, 12.257f, 21.07f, 14.874f)
                    curveTo(21.349f, 14.993f, 21.658f, 14.792f, 21.658f, 14.489f)
                    verticalLineTo(6.925f)
                    horizontalLineTo(2.342f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FFFFFF),
                            1f to Color(0xFFFFFFFF)
                        ),
                        start = Offset(12.352f, 14.332f),
                        end = Offset(12.53f, 16.07f)
                    )
                ) {
                    moveTo(2.342f, 6.925f)
                    verticalLineTo(14.857f)
                    curveTo(2.342f, 15.039f, 2.445f, 15.206f, 2.61f, 15.284f)
                    curveTo(8.761f, 18.203f, 14.919f, 12.257f, 21.07f, 14.874f)
                    curveTo(21.349f, 14.993f, 21.658f, 14.792f, 21.658f, 14.489f)
                    verticalLineTo(6.925f)
                    horizontalLineTo(2.342f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(19.295f, 8.39f),
                        end = Offset(21.994f, 8.39f)
                    )
                ) {
                    moveTo(21.39f, 2.699f)
                    curveTo(18.797f, 1.468f, 16.202f, 1.814f, 13.607f, 2.428f)
                    verticalLineTo(14.747f)
                    curveTo(16.096f, 14.158f, 18.583f, 13.816f, 21.07f, 14.874f)
                    curveTo(21.349f, 14.993f, 21.658f, 14.792f, 21.658f, 14.489f)
                    verticalLineTo(3.126f)
                    curveTo(21.658f, 2.944f, 21.555f, 2.777f, 21.39f, 2.699f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FFFFFF),
                            1f to Color(0xFFFFFFFF)
                        ),
                        start = Offset(20.888f, 8.559f),
                        end = Offset(22.269f, 8.626f)
                    )
                ) {
                    moveTo(21.39f, 2.699f)
                    curveTo(18.797f, 1.468f, 16.202f, 1.814f, 13.607f, 2.428f)
                    verticalLineTo(14.747f)
                    curveTo(16.096f, 14.158f, 18.583f, 13.816f, 21.07f, 14.874f)
                    curveTo(21.349f, 14.993f, 21.658f, 14.792f, 21.658f, 14.489f)
                    verticalLineTo(3.126f)
                    curveTo(21.658f, 2.944f, 21.555f, 2.777f, 21.39f, 2.699f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(7.051f, -4.38f),
                        end = Offset(15.409f, 18.203f)
                    )
                ) {
                    moveTo(20.274f, 5.768f)
                    curveTo(19.843f, 5.811f, 19.397f, 5.688f, 19.038f, 5.388f)
                    curveTo(18.482f, 4.923f, 18.304f, 4.174f, 18.539f, 3.53f)
                    curveTo(18.589f, 3.394f, 18.507f, 3.245f, 18.364f, 3.222f)
                    curveTo(14.178f, 2.541f, 9.989f, 5.202f, 5.803f, 4.609f)
                    curveTo(5.676f, 4.591f, 5.563f, 4.681f, 5.544f, 4.807f)
                    curveTo(5.486f, 5.199f, 5.29f, 5.571f, 4.963f, 5.844f)
                    curveTo(4.603f, 6.144f, 4.157f, 6.267f, 3.726f, 6.225f)
                    curveTo(3.592f, 6.212f, 3.476f, 6.318f, 3.476f, 6.453f)
                    verticalLineTo(11.986f)
                    curveTo(3.476f, 12.122f, 3.592f, 12.228f, 3.726f, 12.215f)
                    curveTo(4.157f, 12.172f, 4.603f, 12.296f, 4.963f, 12.595f)
                    curveTo(5.518f, 13.06f, 5.696f, 13.809f, 5.461f, 14.453f)
                    curveTo(5.411f, 14.589f, 5.494f, 14.738f, 5.636f, 14.762f)
                    curveTo(9.822f, 15.442f, 14.011f, 12.781f, 18.197f, 13.375f)
                    curveTo(18.324f, 13.392f, 18.437f, 13.303f, 18.456f, 13.176f)
                    curveTo(18.514f, 12.785f, 18.71f, 12.413f, 19.038f, 12.139f)
                    curveTo(19.397f, 11.839f, 19.843f, 11.716f, 20.274f, 11.759f)
                    curveTo(20.408f, 11.772f, 20.524f, 11.665f, 20.524f, 11.53f)
                    verticalLineTo(5.997f)
                    curveTo(20.524f, 5.862f, 20.408f, 5.755f, 20.274f, 5.768f)
                    close()
                    moveTo(12f, 12.883f)
                    curveTo(9.851f, 12.883f, 8.109f, 11.141f, 8.109f, 8.992f)
                    curveTo(8.109f, 6.843f, 9.851f, 5.1f, 12f, 5.1f)
                    curveTo(14.149f, 5.1f, 15.891f, 6.843f, 15.891f, 8.992f)
                    curveTo(15.891f, 11.141f, 14.149f, 12.883f, 12f, 12.883f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(6.357f, 4.291f),
                        end = Offset(13.119f, 12.967f)
                    )
                ) {
                    moveTo(10.239f, 8.737f)
                    curveTo(10.239f, 8.713f, 10.236f, 8.684f, 10.231f, 8.649f)
                    curveTo(10.227f, 8.614f, 10.214f, 8.581f, 10.192f, 8.549f)
                    curveTo(10.171f, 8.518f, 10.139f, 8.492f, 10.097f, 8.473f)
                    curveTo(10.056f, 8.454f, 9.996f, 8.449f, 9.92f, 8.46f)
                    curveTo(9.817f, 8.474f, 9.738f, 8.514f, 9.682f, 8.579f)
                    curveTo(9.626f, 8.645f, 9.598f, 8.738f, 9.598f, 8.859f)
                    verticalLineTo(9.802f)
                    curveTo(9.598f, 9.923f, 9.626f, 10.008f, 9.682f, 10.059f)
                    curveTo(9.738f, 10.109f, 9.819f, 10.127f, 9.924f, 10.113f)
                    curveTo(9.995f, 10.103f, 10.051f, 10.084f, 10.092f, 10.054f)
                    curveTo(10.132f, 10.025f, 10.163f, 9.991f, 10.185f, 9.953f)
                    curveTo(10.206f, 9.914f, 10.22f, 9.874f, 10.226f, 9.832f)
                    curveTo(10.232f, 9.79f, 10.236f, 9.75f, 10.239f, 9.714f)
                    curveTo(10.243f, 9.647f, 10.273f, 9.599f, 10.326f, 9.569f)
                    curveTo(10.38f, 9.539f, 10.443f, 9.52f, 10.514f, 9.51f)
                    curveTo(10.612f, 9.497f, 10.684f, 9.504f, 10.729f, 9.532f)
                    curveTo(10.774f, 9.56f, 10.797f, 9.628f, 10.797f, 9.735f)
                    curveTo(10.797f, 9.853f, 10.774f, 9.962f, 10.729f, 10.06f)
                    curveTo(10.684f, 10.159f, 10.62f, 10.245f, 10.539f, 10.319f)
                    curveTo(10.458f, 10.393f, 10.363f, 10.454f, 10.255f, 10.502f)
                    curveTo(10.146f, 10.55f, 10.027f, 10.583f, 9.899f, 10.6f)
                    curveTo(9.782f, 10.616f, 9.671f, 10.616f, 9.568f, 10.601f)
                    curveTo(9.464f, 10.585f, 9.373f, 10.549f, 9.294f, 10.492f)
                    curveTo(9.215f, 10.435f, 9.153f, 10.357f, 9.108f, 10.258f)
                    curveTo(9.062f, 10.158f, 9.04f, 10.032f, 9.04f, 9.878f)
                    verticalLineTo(8.935f)
                    curveTo(9.04f, 8.784f, 9.062f, 8.651f, 9.108f, 8.538f)
                    curveTo(9.153f, 8.425f, 9.215f, 8.33f, 9.294f, 8.252f)
                    curveTo(9.373f, 8.173f, 9.464f, 8.112f, 9.568f, 8.069f)
                    curveTo(9.671f, 8.025f, 9.782f, 7.995f, 9.899f, 7.979f)
                    curveTo(10.027f, 7.962f, 10.146f, 7.961f, 10.255f, 7.977f)
                    curveTo(10.363f, 7.993f, 10.458f, 8.026f, 10.539f, 8.075f)
                    curveTo(10.62f, 8.125f, 10.684f, 8.19f, 10.729f, 8.272f)
                    curveTo(10.774f, 8.353f, 10.797f, 8.451f, 10.797f, 8.565f)
                    curveTo(10.797f, 8.671f, 10.774f, 8.745f, 10.729f, 8.785f)
                    curveTo(10.684f, 8.826f, 10.613f, 8.853f, 10.518f, 8.866f)
                    curveTo(10.441f, 8.876f, 10.377f, 8.873f, 10.325f, 8.856f)
                    curveTo(10.272f, 8.84f, 10.243f, 8.8f, 10.239f, 8.737f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(7.768f, 3.192f),
                        end = Offset(14.53f, 11.867f)
                    )
                ) {
                    moveTo(11.928f, 10.324f)
                    curveTo(11.804f, 10.341f, 11.689f, 10.342f, 11.582f, 10.327f)
                    curveTo(11.476f, 10.311f, 11.384f, 10.275f, 11.305f, 10.219f)
                    curveTo(11.226f, 10.162f, 11.164f, 10.083f, 11.119f, 9.984f)
                    curveTo(11.074f, 9.885f, 11.051f, 9.758f, 11.051f, 9.604f)
                    verticalLineTo(8.662f)
                    curveTo(11.051f, 8.51f, 11.074f, 8.378f, 11.119f, 8.265f)
                    curveTo(11.164f, 8.152f, 11.226f, 8.056f, 11.305f, 7.978f)
                    curveTo(11.384f, 7.9f, 11.476f, 7.839f, 11.582f, 7.794f)
                    curveTo(11.689f, 7.75f, 11.804f, 7.72f, 11.928f, 7.703f)
                    curveTo(12.052f, 7.686f, 12.168f, 7.685f, 12.275f, 7.7f)
                    curveTo(12.382f, 7.715f, 12.475f, 7.751f, 12.554f, 7.808f)
                    curveTo(12.633f, 7.865f, 12.695f, 7.944f, 12.74f, 8.044f)
                    curveTo(12.785f, 8.145f, 12.808f, 8.271f, 12.808f, 8.423f)
                    verticalLineTo(9.365f)
                    curveTo(12.808f, 9.519f, 12.785f, 9.652f, 12.74f, 9.764f)
                    curveTo(12.695f, 9.875f, 12.633f, 9.97f, 12.554f, 10.049f)
                    curveTo(12.475f, 10.127f, 12.382f, 10.188f, 12.275f, 10.232f)
                    curveTo(12.168f, 10.276f, 12.052f, 10.307f, 11.928f, 10.324f)
                    close()
                    moveTo(12.25f, 8.499f)
                    curveTo(12.25f, 8.375f, 12.221f, 8.289f, 12.164f, 8.24f)
                    curveTo(12.107f, 8.191f, 12.028f, 8.173f, 11.928f, 8.187f)
                    curveTo(11.828f, 8.2f, 11.749f, 8.239f, 11.693f, 8.304f)
                    curveTo(11.637f, 8.368f, 11.609f, 8.462f, 11.609f, 8.586f)
                    verticalLineTo(9.528f)
                    curveTo(11.609f, 9.651f, 11.637f, 9.738f, 11.693f, 9.787f)
                    curveTo(11.749f, 9.836f, 11.828f, 9.854f, 11.928f, 9.84f)
                    curveTo(12.028f, 9.827f, 12.107f, 9.788f, 12.164f, 9.723f)
                    curveTo(12.221f, 9.658f, 12.25f, 9.564f, 12.25f, 9.441f)
                    verticalLineTo(8.499f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x0047A920),
                            0.219f to Color(0x3742A725),
                            0.484f to Color(0x7B33A232),
                            0.771f to Color(0xC41B9947),
                            1f to Color(0xFF02905D)
                        ),
                        start = Offset(9.187f, 2.085f),
                        end = Offset(15.949f, 10.761f)
                    )
                ) {
                    moveTo(14.959f, 8.126f)
                    curveTo(14.959f, 7.906f, 14.91f, 7.777f, 14.893f, 7.737f)
                    curveTo(14.849f, 7.639f, 14.789f, 7.563f, 14.714f, 7.509f)
                    curveTo(14.639f, 7.455f, 14.55f, 7.421f, 14.446f, 7.405f)
                    curveTo(14.342f, 7.389f, 14.231f, 7.39f, 14.115f, 7.406f)
                    lineTo(13.374f, 7.507f)
                    curveTo(13.312f, 7.515f, 13.261f, 7.538f, 13.223f, 7.576f)
                    curveTo(13.185f, 7.615f, 13.166f, 7.657f, 13.166f, 7.702f)
                    verticalLineTo(9.964f)
                    curveTo(13.166f, 10.021f, 13.195f, 10.059f, 13.254f, 10.08f)
                    curveTo(13.313f, 10.1f, 13.376f, 10.106f, 13.445f, 10.096f)
                    curveTo(13.514f, 10.087f, 13.578f, 10.064f, 13.637f, 10.028f)
                    curveTo(13.695f, 9.991f, 13.724f, 9.945f, 13.724f, 9.888f)
                    verticalLineTo(9.12f)
                    lineTo(14.079f, 9.071f)
                    curveTo(14.203f, 9.054f, 14.318f, 9.024f, 14.426f, 8.98f)
                    curveTo(14.533f, 8.935f, 14.626f, 8.875f, 14.705f, 8.797f)
                    curveTo(14.784f, 8.721f, 14.846f, 8.627f, 14.891f, 8.516f)
                    curveTo(14.901f, 8.492f, 14.959f, 8.347f, 14.959f, 8.126f)
                    close()
                    moveTo(14.318f, 8.521f)
                    curveTo(14.317f, 8.522f, 14.263f, 8.616f, 14.079f, 8.645f)
                    lineTo(13.724f, 8.693f)
                    verticalLineTo(7.942f)
                    lineTo(14.079f, 7.894f)
                    curveTo(14.081f, 7.894f, 14.082f, 7.894f, 14.084f, 7.894f)
                    curveTo(14.227f, 7.877f, 14.357f, 7.974f, 14.391f, 8.114f)
                    curveTo(14.445f, 8.335f, 14.318f, 8.521f, 14.318f, 8.521f)
                    close()
                }
            }
        }.build()

        return _Cash!!
    }

@Suppress("ObjectPropertyName")
private var _Cash: ImageVector? = null

@Preview
@Composable
private fun CashPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.Cash, contentDescription = null, tint = Color.Unspecified)
        }
    }
}