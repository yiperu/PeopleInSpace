package com.surrus.common.di

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.sqljs.Database
import com.squareup.sqldelight.drivers.sqljs.JsSqlDriver
import org.koin.dsl.module

actual val platformModule = module {
    // placeholder for now to allow rest of project to build....db code not used in Kotlin/JS right now
    single<SqlDriver> { JsSqlDriver(Database()) }
}