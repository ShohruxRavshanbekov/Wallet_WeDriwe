package uz.futuresoft.features.cards.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import uz.futuresoft.common.ui.theme.FigTreeFontFamily
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
internal fun NumberItem(
    number: String,
    onClick: () -> Unit,
) {
    var clicked by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val fontSize by animateFloatAsState(
        targetValue = if (clicked) 24f else 36f,
        animationSpec = tween(100),
    )

    LaunchedEffect(key1 = clicked) {
        if (clicked) {
            delay(100)
            clicked = false
        }
    }

    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(shape = CircleShape)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = {
                    clicked = true
                    onClick()
                },
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = number,
            style = TextStyle(
                color = MaterialTheme.colorScheme.primary,
                fontFamily = FigTreeFontFamily,
                fontWeight = FontWeight.W400,
                fontSize = fontSize.sp,
            )
        )
    }

//    TextButton(
//        onClick = onClick,
//        modifier = Modifier.indication(interactionSource = interactionSource, indication = null),
//        interactionSource = interactionSource,
//        colors = ButtonDefaults.textButtonColors(containerColor = Color.Transparent)
//    ) {
//        Text(
//            text = number,
//            style = TextStyle(
//                color = MaterialTheme.colorScheme.primary,
//                fontFamily = FigTreeFontFamily,
//                fontWeight = FontWeight.W400,
//                fontSize = 36.sp,
//            )
//        )
//    }
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