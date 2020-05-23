package com.surrus.common.di

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import com.surrus.peopleinspace.db.PeopleInSpaceDatabase
import org.koin.dsl.module

actual val platformModule = module {
    single<SqlDriver> { JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        .also { PeopleInSpaceDatabase.Schema.create(it) } }
}