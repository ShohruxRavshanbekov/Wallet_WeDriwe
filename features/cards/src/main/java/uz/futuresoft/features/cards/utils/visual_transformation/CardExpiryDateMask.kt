package uz.futuresoft.features.cards.utils.visual_transformation

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class CardExpiryDateMask : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val trimmed = text.text.filter { it.isDigit() }
        val formatted = buildString {
            for (i in trimmed.indices) {
                append(trimmed[i])
                if (i == 1) append("/")
            }
        }

        val mapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return if (offset > 1) offset + 1 else offset
            }

            override fun transformedToOriginal(offset: Int): Int {
                return if (offset > 2) offset - 1 else offset
            }
        }

        return TransformedText(text = AnnotatedString(formatted), offsetMapping = mapping)
    }
}