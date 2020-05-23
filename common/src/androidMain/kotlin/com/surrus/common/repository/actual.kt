package com.surrus.common.repository

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

lateinit var appContext: Context

actual fun ktorScope(block: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Main) { block() }
}
