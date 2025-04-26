package uz.futuresoft.features.cards.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import uz.futuresoft.common.ui.icons.AppIcons
import uz.futuresoft.common.ui.icons.RemoveDigit
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
internal fun RemoveDigitButton(
    onClick: () -> Unit,
) {
    var clicked by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val iconSize by animateDpAsState(
        targetValue = if (clicked) 24.dp else 32.dp,
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
        Icon(
            imageVector = AppIcons.RemoveDigit,
            contentDescription = null,
            modifier = Modifier.size(iconSize)
        )
    }
}

@Preview
@Composable
private fun RemoveDigitButtonPreview() {
    WalletWeDriveTheme {
        RemoveDigitButton(onClick = {})
    }
}