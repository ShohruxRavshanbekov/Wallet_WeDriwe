package uz.futuresoft.common.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import uz.futuresoft.common.R

val FigTreeFontFamily = FontFamily(
    Font(R.font.figtree_regular, FontWeight.Normal),
    Font(R.font.figtree_medium, FontWeight.Medium),
    Font(R.font.figtree_semi_bold, FontWeight.SemiBold),
    Font(R.font.figtree_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FigTreeFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 25.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = FigTreeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = FigTreeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = FigTreeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = FigTreeFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
)