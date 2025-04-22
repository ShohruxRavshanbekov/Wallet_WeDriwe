package uz.futuresoft.data.utils

import android.util.Log
import io.ktor.client.plugins.logging.Logger

class CustomLogger(private val tag: String) : Logger {
    override fun log(message: String) {
        Log.d(tag, message)
    }
}