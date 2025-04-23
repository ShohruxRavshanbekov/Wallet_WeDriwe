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

val AppIcons.Card: ImageVector
    get() {
        if (_Card != null) {
            return _Card!!
        }
        _Card = ImageVector.Builder(
            name = "Card",
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
                            0f to Color(0xFF5A5A5A),
                            1f to Color(0xFF444444)
                        ),
                        start = Offset(7.065f, 0.765f),
                        end = Offset(13.097f, 14.377f)
                    )
                ) {
                    moveTo(18.743f, 16.304f)
                    lineTo(0.794f, 13.781f)
                    curveTo(0.29f, 13.711f, -0.062f, 13.244f, 0.009f, 12.74f)
                    lineTo(1.497f, 2.153f)
                    curveTo(1.568f, 1.649f, 2.034f, 1.297f, 2.539f, 1.368f)
                    lineTo(20.487f, 3.89f)
                    curveTo(20.992f, 3.961f, 21.344f, 4.428f, 21.273f, 4.932f)
                    lineTo(19.785f, 15.519f)
                    curveTo(19.714f, 16.023f, 19.247f, 16.375f, 18.743f, 16.304f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF003CC0))) {
                    moveTo(18.743f, 16.304f)
                    lineTo(0.794f, 13.781f)
                    curveTo(0.29f, 13.711f, -0.062f, 13.244f, 0.009f, 12.74f)
                    lineTo(1.497f, 2.153f)
                    curveTo(1.568f, 1.649f, 2.034f, 1.297f, 2.539f, 1.368f)
                    lineTo(20.487f, 3.89f)
                    curveTo(20.992f, 3.961f, 21.344f, 4.428f, 21.273f, 4.932f)
                    lineTo(19.785f, 15.519f)
                    curveTo(19.714f, 16.023f, 19.247f, 16.375f, 18.743f, 16.304f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(10.025f, 13.21f),
                        end = Offset(9.798f, 14.822f)
                    )
                ) {
                    moveTo(0.875f, 6.577f)
                    lineTo(0.009f, 12.74f)
                    curveTo(-0.062f, 13.244f, 0.29f, 13.711f, 0.794f, 13.781f)
                    lineTo(18.743f, 16.304f)
                    curveTo(19.247f, 16.375f, 19.714f, 16.023f, 19.785f, 15.519f)
                    lineTo(20.651f, 9.356f)
                    lineTo(0.875f, 6.577f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(17.892f, 9.85f),
                        end = Offset(20.31f, 10.189f)
                    )
                ) {
                    moveTo(20.488f, 3.89f)
                    lineTo(13.49f, 2.907f)
                    lineTo(11.746f, 15.321f)
                    lineTo(18.743f, 16.304f)
                    curveTo(19.248f, 16.375f, 19.714f, 16.023f, 19.785f, 15.519f)
                    lineTo(21.273f, 4.932f)
                    curveTo(21.344f, 4.428f, 20.992f, 3.961f, 20.488f, 3.89f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(7.878f, -13.094f),
                        end = Offset(12.76f, 16.487f)
                    )
                ) {
                    moveTo(0.93f, 6.187f)
                    lineTo(20.706f, 8.966f)
                    lineTo(21.14f, 5.873f)
                    lineTo(1.365f, 3.093f)
                    lineTo(0.93f, 6.187f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(5.131f, 2.54f),
                        end = Offset(6.526f, 10.99f)
                    )
                ) {
                    moveTo(9.297f, 8.749f)
                    lineTo(2.69f, 7.82f)
                    curveTo(2.536f, 7.799f, 2.429f, 7.656f, 2.45f, 7.502f)
                    curveTo(2.472f, 7.348f, 2.614f, 7.241f, 2.768f, 7.263f)
                    lineTo(9.375f, 8.191f)
                    curveTo(9.529f, 8.213f, 9.636f, 8.355f, 9.615f, 8.509f)
                    curveTo(9.593f, 8.663f, 9.451f, 8.77f, 9.297f, 8.749f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(17.323f, 7.292f),
                        end = Offset(17.923f, 10.927f)
                    )
                ) {
                    moveTo(18.564f, 10.051f)
                    lineTo(16.786f, 9.801f)
                    curveTo(16.632f, 9.78f, 16.525f, 9.637f, 16.547f, 9.483f)
                    curveTo(16.568f, 9.329f, 16.711f, 9.222f, 16.865f, 9.244f)
                    lineTo(18.642f, 9.494f)
                    curveTo(18.796f, 9.515f, 18.903f, 9.658f, 18.882f, 9.812f)
                    curveTo(18.86f, 9.965f, 18.718f, 10.073f, 18.564f, 10.051f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(4.23f, 8.456f),
                        end = Offset(4.261f, 10.31f)
                    )
                ) {
                    moveTo(5.754f, 10.277f)
                    lineTo(2.541f, 9.825f)
                    curveTo(2.315f, 9.793f, 2.158f, 9.585f, 2.19f, 9.359f)
                    lineTo(2.269f, 8.797f)
                    curveTo(2.3f, 8.571f, 2.509f, 8.414f, 2.735f, 8.446f)
                    lineTo(5.948f, 8.897f)
                    curveTo(6.174f, 8.929f, 6.331f, 9.138f, 6.299f, 9.363f)
                    lineTo(6.22f, 9.925f)
                    curveTo(6.188f, 10.151f, 5.98f, 10.308f, 5.754f, 10.277f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00DBD5EF),
                            0.285f to Color(0x48D9D2EE),
                            0.474f to Color(0x78D4C9E9),
                            0.635f to Color(0xA1CBBAE2),
                            0.779f to Color(0xC6BFA5D7),
                            0.913f to Color(0xE8AF8ACA),
                            1f to Color(0xFFA274BF)
                        ),
                        start = Offset(4.215f, 9.575f),
                        end = Offset(4.339f, 8.686f)
                    )
                ) {
                    moveTo(5.754f, 10.277f)
                    lineTo(2.541f, 9.825f)
                    curveTo(2.315f, 9.793f, 2.158f, 9.585f, 2.19f, 9.359f)
                    lineTo(2.269f, 8.797f)
                    curveTo(2.3f, 8.571f, 2.509f, 8.414f, 2.735f, 8.446f)
                    lineTo(5.948f, 8.897f)
                    curveTo(6.174f, 8.929f, 6.331f, 9.138f, 6.299f, 9.363f)
                    lineTo(6.22f, 9.925f)
                    curveTo(6.188f, 10.151f, 5.98f, 10.308f, 5.754f, 10.277f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00DBD5EF),
                            0.285f to Color(0x48D9D2EE),
                            0.474f to Color(0x78D4C9E9),
                            0.635f to Color(0xA1CBBAE2),
                            0.779f to Color(0xC6BFA5D7),
                            0.913f to Color(0xE8AF8ACA),
                            1f to Color(0xFFA274BF)
                        ),
                        start = Offset(3.168f, 9.206f),
                        end = Offset(2.208f, 9.071f)
                    )
                ) {
                    moveTo(5.754f, 10.277f)
                    lineTo(2.541f, 9.825f)
                    curveTo(2.315f, 9.793f, 2.158f, 9.585f, 2.19f, 9.359f)
                    lineTo(2.269f, 8.797f)
                    curveTo(2.3f, 8.571f, 2.509f, 8.414f, 2.735f, 8.446f)
                    lineTo(5.948f, 8.897f)
                    curveTo(6.174f, 8.929f, 6.331f, 9.138f, 6.299f, 9.363f)
                    lineTo(6.22f, 9.925f)
                    curveTo(6.188f, 10.151f, 5.98f, 10.308f, 5.754f, 10.277f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFF5A5A5A),
                            1f to Color(0xFF444444)
                        ),
                        start = Offset(6.499f, 8.178f),
                        end = Offset(17.375f, 18.354f)
                    )
                ) {
                    moveTo(23.316f, 17.918f)
                    lineTo(5.808f, 22.61f)
                    curveTo(5.316f, 22.741f, 4.81f, 22.449f, 4.679f, 21.957f)
                    lineTo(1.912f, 11.631f)
                    curveTo(1.78f, 11.139f, 2.072f, 10.633f, 2.564f, 10.501f)
                    lineTo(20.072f, 5.81f)
                    curveTo(20.564f, 5.678f, 21.069f, 5.97f, 21.201f, 6.462f)
                    lineTo(23.968f, 16.788f)
                    curveTo(24.1f, 17.281f, 23.808f, 17.787f, 23.316f, 17.918f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(14.089f, 18.481f),
                        end = Offset(14.511f, 20.055f)
                    )
                ) {
                    moveTo(3.068f, 15.946f)
                    lineTo(4.679f, 21.957f)
                    curveTo(4.811f, 22.449f, 5.316f, 22.741f, 5.809f, 22.61f)
                    lineTo(23.316f, 17.918f)
                    curveTo(23.808f, 17.787f, 24.1f, 17.281f, 23.968f, 16.788f)
                    lineTo(22.358f, 10.777f)
                    lineTo(3.068f, 15.946f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(6.187f, 13.463f),
                        end = Offset(10.774f, 20.699f)
                    )
                ) {
                    moveTo(12.443f, 17.549f)
                    lineTo(5.999f, 19.276f)
                    curveTo(5.849f, 19.316f, 5.694f, 19.227f, 5.654f, 19.077f)
                    curveTo(5.614f, 18.927f, 5.703f, 18.772f, 5.853f, 18.732f)
                    lineTo(12.298f, 17.005f)
                    curveTo(12.448f, 16.965f, 12.602f, 17.054f, 12.642f, 17.204f)
                    curveTo(12.682f, 17.354f, 12.593f, 17.509f, 12.443f, 17.549f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00433F43),
                            1f to Color(0xFF1A1A1A)
                        ),
                        start = Offset(20.021f, 12.311f),
                        end = Offset(22.38f, 11.679f)
                    )
                ) {
                    moveTo(20.072f, 5.81f)
                    lineTo(13.246f, 7.639f)
                    lineTo(16.491f, 19.747f)
                    lineTo(23.316f, 17.918f)
                    curveTo(23.808f, 17.787f, 24.1f, 17.281f, 23.968f, 16.788f)
                    lineTo(21.201f, 6.462f)
                    curveTo(21.07f, 5.97f, 20.564f, 5.678f, 20.072f, 5.81f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFEF0AE),
                            1f to Color(0xFFFAC600)
                        ),
                        start = Offset(5.593f, 12.141f),
                        end = Offset(7.65f, 14.923f)
                    )
                ) {
                    moveTo(8.328f, 14.714f)
                    lineTo(5.63f, 15.437f)
                    curveTo(5.14f, 15.568f, 4.636f, 15.277f, 4.505f, 14.787f)
                    lineTo(4.093f, 13.25f)
                    curveTo(3.961f, 12.759f, 4.252f, 12.256f, 4.742f, 12.124f)
                    lineTo(7.44f, 11.401f)
                    curveTo(7.93f, 11.27f, 8.434f, 11.561f, 8.566f, 12.051f)
                    lineTo(8.978f, 13.589f)
                    curveTo(9.109f, 14.079f, 8.818f, 14.583f, 8.328f, 14.714f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FE9738),
                            1f to Color(0xFFFE9738)
                        ),
                        start = Offset(6.598f, 13.643f),
                        end = Offset(6.936f, 14.903f)
                    )
                ) {
                    moveTo(8.328f, 14.714f)
                    lineTo(5.63f, 15.437f)
                    curveTo(5.14f, 15.568f, 4.636f, 15.277f, 4.505f, 14.787f)
                    lineTo(4.093f, 13.25f)
                    curveTo(3.961f, 12.759f, 4.252f, 12.256f, 4.742f, 12.124f)
                    lineTo(7.44f, 11.401f)
                    curveTo(7.93f, 11.27f, 8.434f, 11.561f, 8.566f, 12.051f)
                    lineTo(8.978f, 13.589f)
                    curveTo(9.109f, 14.079f, 8.818f, 14.583f, 8.328f, 14.714f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FE9738),
                            1f to Color(0xFFFE9738)
                        ),
                        start = Offset(4.848f, 11.479f),
                        end = Offset(8.848f, 15.988f)
                    )
                ) {
                    moveTo(5.63f, 15.437f)
                    lineTo(8.328f, 14.714f)
                    curveTo(8.818f, 14.583f, 9.109f, 14.079f, 8.978f, 13.589f)
                    lineTo(8.566f, 12.051f)
                    curveTo(8.499f, 11.801f, 8.334f, 11.603f, 8.124f, 11.486f)
                    lineTo(7.28f, 12.947f)
                    curveTo(7.174f, 13.131f, 6.999f, 13.265f, 6.794f, 13.32f)
                    lineTo(6.296f, 13.453f)
                    curveTo(6.091f, 13.508f, 5.916f, 13.642f, 5.81f, 13.826f)
                    lineTo(4.933f, 15.345f)
                    curveTo(5.136f, 15.463f, 5.385f, 15.503f, 5.63f, 15.437f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FE9738),
                            1f to Color(0xFFFE9738)
                        ),
                        start = Offset(7.028f, 10.9f),
                        end = Offset(5.82f, 16.805f)
                    )
                ) {
                    moveTo(8.328f, 14.714f)
                    lineTo(5.63f, 15.437f)
                    curveTo(5.14f, 15.568f, 4.636f, 15.277f, 4.505f, 14.787f)
                    lineTo(4.093f, 13.25f)
                    curveTo(4.026f, 12.999f, 4.069f, 12.745f, 4.193f, 12.539f)
                    lineTo(5.654f, 13.383f)
                    curveTo(5.838f, 13.489f, 6.056f, 13.518f, 6.261f, 13.463f)
                    lineTo(6.76f, 13.329f)
                    curveTo(6.965f, 13.274f, 7.183f, 13.303f, 7.367f, 13.409f)
                    lineTo(8.886f, 14.286f)
                    curveTo(8.768f, 14.49f, 8.573f, 14.648f, 8.328f, 14.714f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FE9738),
                            1f to Color(0xFFFE9738)
                        ),
                        start = Offset(7.516f, 13.157f),
                        end = Offset(8.565f, 12.876f)
                    )
                ) {
                    moveTo(7.44f, 11.401f)
                    lineTo(5.567f, 11.903f)
                    lineTo(6.455f, 15.216f)
                    lineTo(8.328f, 14.714f)
                    curveTo(8.818f, 14.583f, 9.109f, 14.079f, 8.978f, 13.589f)
                    lineTo(8.566f, 12.051f)
                    curveTo(8.434f, 11.561f, 7.931f, 11.27f, 7.44f, 11.401f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(8.648f, 19.373f),
                        end = Offset(8.808f, 19.967f)
                    )
                ) {
                    moveTo(11.274f, 19.4f)
                    lineTo(6.38f, 20.712f)
                    curveTo(6.232f, 20.751f, 6.079f, 20.663f, 6.039f, 20.515f)
                    lineTo(5.907f, 20.022f)
                    curveTo(5.867f, 19.873f, 5.956f, 19.721f, 6.104f, 19.681f)
                    lineTo(10.998f, 18.369f)
                    curveTo(11.147f, 18.33f, 11.3f, 18.418f, 11.339f, 18.566f)
                    lineTo(11.471f, 19.059f)
                    curveTo(11.511f, 19.208f, 11.423f, 19.36f, 11.274f, 19.4f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(13.368f, 18.108f),
                        end = Offset(13.528f, 18.702f)
                    )
                ) {
                    moveTo(14.771f, 18.463f)
                    lineTo(12.324f, 19.119f)
                    curveTo(12.175f, 19.159f, 12.022f, 19.071f, 11.983f, 18.922f)
                    lineTo(11.851f, 18.429f)
                    curveTo(11.811f, 18.281f, 11.899f, 18.128f, 12.047f, 18.088f)
                    lineTo(14.494f, 17.433f)
                    curveTo(14.643f, 17.393f, 14.796f, 17.481f, 14.835f, 17.63f)
                    lineTo(14.967f, 18.122f)
                    curveTo(15.007f, 18.271f, 14.919f, 18.424f, 14.771f, 18.463f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(16.936f, 17.151f),
                        end = Offset(17.095f, 17.745f)
                    )
                ) {
                    moveTo(18.338f, 17.507f)
                    lineTo(15.891f, 18.163f)
                    curveTo(15.742f, 18.203f, 15.589f, 18.115f, 15.55f, 17.966f)
                    lineTo(15.418f, 17.474f)
                    curveTo(15.378f, 17.325f, 15.466f, 17.172f, 15.615f, 17.132f)
                    lineTo(18.062f, 16.477f)
                    curveTo(18.21f, 16.437f, 18.363f, 16.525f, 18.403f, 16.674f)
                    lineTo(18.535f, 17.167f)
                    curveTo(18.574f, 17.315f, 18.486f, 17.468f, 18.338f, 17.507f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFB3DAFE),
                            1f to Color(0xFF0182FC)
                        ),
                        start = Offset(18.72f, 15.442f),
                        end = Offset(20.072f, 16.223f)
                    )
                ) {
                    moveTo(20.548f, 15.023f)
                    lineTo(19.066f, 14.529f)
                    curveTo(18.668f, 14.396f, 18.282f, 14.76f, 18.391f, 15.165f)
                    lineTo(18.836f, 16.828f)
                    curveTo(18.945f, 17.233f, 19.461f, 17.355f, 19.739f, 17.041f)
                    lineTo(20.776f, 15.872f)
                    curveTo(21.027f, 15.59f, 20.907f, 15.142f, 20.548f, 15.023f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFA1AE),
                            1f to Color(0xFFFF4565)
                        ),
                        start = Offset(20.292f, 14.894f),
                        end = Offset(21.241f, 15.441f)
                    )
                ) {
                    moveTo(19.619f, 15.272f)
                    lineTo(20.656f, 14.103f)
                    curveTo(20.934f, 13.789f, 21.45f, 13.911f, 21.559f, 14.316f)
                    lineTo(22.004f, 15.979f)
                    curveTo(22.113f, 16.384f, 21.727f, 16.748f, 21.329f, 16.615f)
                    lineTo(19.847f, 16.121f)
                    curveTo(19.488f, 16.002f, 19.368f, 15.555f, 19.619f, 15.272f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0x00FE0364),
                            0.234f to Color(0x3BF90362),
                            0.517f to Color(0x83EA035B),
                            0.824f to Color(0xD2D20250),
                            1f to Color(0xFFC00148)
                        ),
                        start = Offset(21.225f, 15.296f),
                        end = Offset(21.728f, 15.161f)
                    )
                ) {
                    moveTo(19.619f, 15.272f)
                    lineTo(20.656f, 14.103f)
                    curveTo(20.934f, 13.789f, 21.45f, 13.911f, 21.559f, 14.316f)
                    lineTo(22.004f, 15.979f)
                    curveTo(22.113f, 16.384f, 21.727f, 16.748f, 21.329f, 16.615f)
                    lineTo(19.847f, 16.121f)
                    curveTo(19.488f, 16.002f, 19.368f, 15.555f, 19.619f, 15.272f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(15.809f, 9.53f),
                        end = Offset(15.969f, 10.125f)
                    )
                ) {
                    moveTo(16.395f, 10.107f)
                    lineTo(15.583f, 10.324f)
                    curveTo(15.434f, 10.364f, 15.281f, 10.276f, 15.241f, 10.127f)
                    lineTo(15.109f, 9.635f)
                    curveTo(15.07f, 9.486f, 15.158f, 9.334f, 15.307f, 9.294f)
                    lineTo(16.119f, 9.076f)
                    curveTo(16.268f, 9.036f, 16.42f, 9.124f, 16.46f, 9.273f)
                    lineTo(16.592f, 9.766f)
                    curveTo(16.632f, 9.914f, 16.544f, 10.067f, 16.395f, 10.107f)
                    close()
                }
                path(
                    fill = Brush.linearGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFF5FBFF),
                            1f to Color(0xFFDBD5EF)
                        ),
                        start = Offset(18.488f, 8.812f),
                        end = Offset(18.648f, 9.406f)
                    )
                ) {
                    moveTo(19.891f, 9.17f)
                    lineTo(17.444f, 9.826f)
                    curveTo(17.296f, 9.865f, 17.143f, 9.777f, 17.103f, 9.629f)
                    lineTo(16.971f, 9.136f)
                    curveTo(16.931f, 8.987f, 17.02f, 8.835f, 17.168f, 8.795f)
                    lineTo(19.615f, 8.139f)
                    curveTo(19.764f, 8.099f, 19.917f, 8.188f, 19.956f, 8.336f)
                    lineTo(20.088f, 8.829f)
                    curveTo(20.128f, 8.977f, 20.04f, 9.13f, 19.891f, 9.17f)
                    close()
                }
            }
        }.build()

        return _Card!!
    }

@Suppress("ObjectPropertyName")
private var _Card: ImageVector? = null

@Preview
@Composable
private fun CardPreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.Card, contentDescription = null, tint = Color.Unspecified)
        }
    }
}