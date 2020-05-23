package com.surrus.common.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

actual fun ktorScope(block: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Main) { block() }
}
