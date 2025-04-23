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
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

val AppIcons.PromoCode: ImageVector
    get() {
        if (_PromoCode != null) {
            return _PromoCode!!
        }
        _PromoCode = ImageVector.Builder(
            name = "PromoCode",
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
                path(fill = SolidColor(Color(0xFF4166D5))) {
                    moveTo(23.517f, 12f)
                    curveTo(23.517f, 13.564f, 22.313f, 14.878f, 21.749f, 16.238f)
                    curveTo(21.164f, 17.648f, 21.5f, 19.374f, 20.437f, 20.437f)
                    curveTo(19.374f, 21.5f, 17.648f, 21.55f, 16.238f, 22.135f)
                    curveTo(14.878f, 22.699f, 13.564f, 23.952f, 12f, 23.952f)
                    curveTo(11.753f, 23.952f, 11.512f, 23.97f, 11.276f, 23.917f)
                    curveTo(10.019f, 23.635f, 8.907f, 22.706f, 7.762f, 22.232f)
                    curveTo(6.352f, 21.647f, 4.577f, 21.548f, 3.515f, 20.485f)
                    curveTo(2.452f, 19.423f, 2.353f, 17.648f, 1.768f, 16.238f)
                    curveTo(1.204f, 14.878f, 0f, 13.564f, 0f, 12f)
                    curveTo(0f, 10.436f, 1.204f, 9.122f, 1.768f, 7.762f)
                    curveTo(2.353f, 6.352f, 2.452f, 4.577f, 3.515f, 3.515f)
                    curveTo(4.577f, 2.452f, 6.352f, 2.353f, 7.762f, 1.768f)
                    curveTo(8.907f, 1.293f, 10.019f, 0.365f, 11.276f, 0.083f)
                    curveTo(11.512f, 0.03f, 11.753f, 0.097f, 12f, 0.097f)
                    curveTo(13.564f, 0.097f, 14.878f, 1.349f, 16.238f, 1.913f)
                    curveTo(17.648f, 2.498f, 18.94f, 2.935f, 20.002f, 3.998f)
                    curveTo(21.065f, 5.06f, 21.164f, 6.835f, 21.749f, 8.245f)
                    curveTo(22.313f, 9.605f, 23.517f, 10.436f, 23.517f, 12f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0B3EB5))) {
                    moveTo(22.232f, 7.762f)
                    curveTo(21.647f, 6.352f, 21.548f, 4.577f, 20.485f, 3.515f)
                    curveTo(19.423f, 2.452f, 17.648f, 2.353f, 16.238f, 1.768f)
                    curveTo(14.878f, 1.204f, 13.564f, 0f, 12f, 0f)
                    curveTo(11.753f, 0f, 11.512f, 0.03f, 11.276f, 0.083f)
                    curveTo(12.532f, 0.365f, 13.644f, 1.294f, 14.789f, 1.768f)
                    curveTo(16.199f, 2.353f, 17.974f, 2.452f, 19.037f, 3.515f)
                    curveTo(20.099f, 4.577f, 20.198f, 6.352f, 20.783f, 7.762f)
                    curveTo(21.347f, 9.122f, 22.551f, 10.436f, 22.551f, 12f)
                    curveTo(22.551f, 13.564f, 21.347f, 14.878f, 20.783f, 16.238f)
                    curveTo(20.198f, 17.648f, 20.099f, 19.423f, 19.037f, 20.485f)
                    curveTo(17.974f, 21.548f, 16.199f, 21.647f, 14.789f, 22.232f)
                    curveTo(13.644f, 22.706f, 12.532f, 23.635f, 11.276f, 23.917f)
                    curveTo(11.512f, 23.97f, 11.753f, 24f, 12f, 24f)
                    curveTo(13.564f, 24f, 14.878f, 22.796f, 16.238f, 22.232f)
                    curveTo(17.648f, 21.647f, 19.423f, 21.548f, 20.485f, 20.485f)
                    curveTo(21.548f, 19.423f, 21.647f, 17.648f, 22.232f, 16.238f)
                    curveTo(22.796f, 14.878f, 24f, 13.564f, 24f, 12f)
                    curveTo(24f, 10.436f, 22.796f, 9.122f, 22.232f, 7.762f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9F7F8))) {
                    moveTo(9.686f, 18.359f)
                    curveTo(9.577f, 18.359f, 9.466f, 18.338f, 9.359f, 18.293f)
                    curveTo(8.929f, 18.112f, 8.726f, 17.617f, 8.907f, 17.187f)
                    lineTo(13.535f, 6.159f)
                    curveTo(13.715f, 5.729f, 14.21f, 5.526f, 14.641f, 5.707f)
                    curveTo(15.071f, 5.888f, 15.274f, 6.383f, 15.093f, 6.813f)
                    lineTo(10.465f, 17.841f)
                    curveTo(10.329f, 18.164f, 10.016f, 18.359f, 9.686f, 18.359f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9F7F8))) {
                    moveTo(7.837f, 12.084f)
                    curveTo(6.243f, 12.084f, 4.946f, 10.639f, 4.946f, 8.862f)
                    curveTo(4.946f, 7.086f, 6.243f, 5.641f, 7.837f, 5.641f)
                    curveTo(9.43f, 5.641f, 10.726f, 7.086f, 10.726f, 8.862f)
                    curveTo(10.726f, 10.639f, 9.43f, 12.084f, 7.837f, 12.084f)
                    close()
                    moveTo(7.837f, 7.331f)
                    curveTo(7.175f, 7.331f, 6.637f, 8.018f, 6.637f, 8.862f)
                    curveTo(6.637f, 9.707f, 7.175f, 10.394f, 7.837f, 10.394f)
                    curveTo(8.498f, 10.394f, 9.036f, 9.707f, 9.036f, 8.862f)
                    curveTo(9.036f, 8.018f, 8.498f, 7.331f, 7.837f, 7.331f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9F7F8))) {
                    moveTo(16.163f, 18.359f)
                    curveTo(14.57f, 18.359f, 13.273f, 16.914f, 13.273f, 15.138f)
                    curveTo(13.273f, 13.361f, 14.57f, 11.916f, 16.163f, 11.916f)
                    curveTo(17.757f, 11.916f, 19.053f, 13.361f, 19.053f, 15.138f)
                    curveTo(19.053f, 16.914f, 17.757f, 18.359f, 16.163f, 18.359f)
                    close()
                    moveTo(16.163f, 13.606f)
                    curveTo(15.502f, 13.606f, 14.964f, 14.293f, 14.964f, 15.138f)
                    curveTo(14.964f, 15.982f, 15.502f, 16.669f, 16.163f, 16.669f)
                    curveTo(16.825f, 16.669f, 17.363f, 15.982f, 17.363f, 15.138f)
                    curveTo(17.363f, 14.293f, 16.825f, 13.606f, 16.163f, 13.606f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF7BBA))) {
                    moveTo(23.517f, 3.23f)
                    curveTo(23.517f, 5.013f, 22.554f, 6.411f, 20.771f, 6.411f)
                    curveTo(20.521f, 6.411f, 20.279f, 6.431f, 20.046f, 6.377f)
                    curveTo(18.611f, 6.048f, 17.541f, 4.764f, 17.541f, 3.229f)
                    curveTo(17.541f, 1.695f, 18.611f, 0.41f, 20.046f, 0.082f)
                    curveTo(20.279f, 0.028f, 20.521f, 0.048f, 20.771f, 0.048f)
                    curveTo(22.554f, 0.048f, 23.517f, 1.446f, 23.517f, 3.23f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF3A9B))) {
                    moveTo(20.771f, 0f)
                    curveTo(20.521f, 0f, 20.279f, 0.029f, 20.046f, 0.083f)
                    curveTo(21.481f, 0.412f, 22.551f, 1.695f, 22.551f, 3.23f)
                    curveTo(22.551f, 4.764f, 21.481f, 6.047f, 20.046f, 6.376f)
                    curveTo(20.279f, 6.43f, 20.521f, 6.459f, 20.771f, 6.459f)
                    curveTo(22.554f, 6.459f, 24f, 5.013f, 24f, 3.23f)
                    curveTo(24f, 1.446f, 22.554f, 0f, 20.771f, 0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9F7F8))) {
                    moveTo(22.038f, 3.543f)
                    lineTo(21.495f, 3.23f)
                    lineTo(22.038f, 2.916f)
                    curveTo(22.211f, 2.816f, 22.271f, 2.594f, 22.171f, 2.421f)
                    curveTo(22.071f, 2.248f, 21.849f, 2.189f, 21.676f, 2.289f)
                    lineTo(21.133f, 2.602f)
                    verticalLineTo(1.975f)
                    curveTo(21.133f, 1.775f, 20.971f, 1.613f, 20.771f, 1.613f)
                    curveTo(20.57f, 1.613f, 20.408f, 1.775f, 20.408f, 1.975f)
                    verticalLineTo(2.602f)
                    lineTo(19.865f, 2.289f)
                    curveTo(19.692f, 2.188f, 19.47f, 2.248f, 19.37f, 2.421f)
                    curveTo(19.27f, 2.594f, 19.33f, 2.816f, 19.503f, 2.916f)
                    lineTo(20.046f, 3.229f)
                    lineTo(19.503f, 3.543f)
                    curveTo(19.33f, 3.643f, 19.27f, 3.865f, 19.37f, 4.038f)
                    curveTo(19.438f, 4.154f, 19.559f, 4.219f, 19.684f, 4.219f)
                    curveTo(19.746f, 4.219f, 19.808f, 4.203f, 19.865f, 4.17f)
                    lineTo(20.408f, 3.857f)
                    verticalLineTo(4.484f)
                    curveTo(20.408f, 4.684f, 20.57f, 4.846f, 20.771f, 4.846f)
                    curveTo(20.971f, 4.846f, 21.133f, 4.684f, 21.133f, 4.484f)
                    verticalLineTo(3.857f)
                    lineTo(21.676f, 4.17f)
                    curveTo(21.733f, 4.203f, 21.795f, 4.219f, 21.857f, 4.219f)
                    curveTo(21.982f, 4.219f, 22.104f, 4.154f, 22.171f, 4.038f)
                    curveTo(22.271f, 3.865f, 22.211f, 3.643f, 22.038f, 3.543f)
                    close()
                }
            }
        }.build()

        return _PromoCode!!
    }

@Suppress("ObjectPropertyName")
private var _PromoCode: ImageVector? = null

@Preview
@Composable
private fun PromoCodePreview() {
    WalletWeDriveTheme {
        Box(modifier = Modifier.padding(12.dp), contentAlignment = Alignment.Center) {
            Icon(imageVector = AppIcons.PromoCode, contentDescription = null, tint = Color.Unspecified)
        }
    }
}