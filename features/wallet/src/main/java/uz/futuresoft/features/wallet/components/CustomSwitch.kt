package uz.futuresoft.features.wallet.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import uz.futuresoft.common.ui.theme.WalletWeDriveTheme

@Composable
internal fun CustomSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    val switchWidth = 44.dp
    val switchHeight = 24.dp
    val thumbSize = 20.dp
    val padding = 2.dp

    val thumbOffset by animateDpAsState(
        targetValue = if (checked) (switchWidth - thumbSize - padding) else padding,
        label = "Thumb Offset"
    )

    val trackColor by animateColorAsState(
        targetValue = if (checked) Color(0xFF1D1D1D) else Color(0xFFECEDF1),
        label = "Track Color"
    )

    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = Modifier
            .size(width = switchWidth, height = switchHeight)
            .clip(CircleShape)
            .background(trackColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) { onCheckedChange(!checked) }
    ) {
        Box(
            modifier = Modifier
                .size(thumbSize)
                .offset { IntOffset(x = thumbOffset.roundToPx(), y = 0) }
                .align(Alignment.CenterStart)
                .clip(CircleShape)
                .background(Color.White)
        )
    }
}

@Preview
@Composable
private fun CustomSwitchPreview() {
    WalletWeDriveTheme {
        CustomSwitch(checked = false, onCheckedChange = {})
    }
}