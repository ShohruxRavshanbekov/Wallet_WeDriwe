package uz.futuresoft.features.cards.utils.visual_transformation

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class CardNumberMask : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val digits = text.text.filter { it.isDigit() }
        val transformedText = buildString {
            for (i in digits.indices) {
                append(digits[i])
                if ((i + 1) % 4 == 0 && i != digits.lastIndex) append(" ")
            }
        }

        val mapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                var extraSpaces = 0
                for (i in 0 until offset) {
                    if (i > 0 && i % 4 == 0) extraSpaces++
                }
                return (offset + extraSpaces).coerceAtMost(transformedText.length)
            }

            override fun transformedToOriginal(offset: Int): Int {
                var originalIndex = offset
                for (i in 0 until offset) {
                    if (i > 0 && (i + 1) % 5 == 0) originalIndex--
                }
                return originalIndex.coerceAtMost(digits.length)
            }
        }

        return TransformedText(text = AnnotatedString(transformedText), offsetMapping = mapping)
    }
}