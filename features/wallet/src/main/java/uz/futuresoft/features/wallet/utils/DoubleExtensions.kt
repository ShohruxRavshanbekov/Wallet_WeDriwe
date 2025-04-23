package uz.futuresoft.features.wallet.utils

import java.text.DecimalFormat

fun Double.formatToMoney(): String {
    val formatter = DecimalFormat("0,000.00")
    return formatter.format(this)
}