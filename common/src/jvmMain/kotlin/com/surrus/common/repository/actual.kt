package com.surrus.common.repository

actual fun ktorScope(block: suspend () -> Unit) = kotlinx.coroutines.runBlocking { block() }
