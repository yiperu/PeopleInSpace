package com.surrus.common.di

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import com.surrus.peopleinspace.db.PeopleInSpaceDatabase
import org.koin.dsl.module

actual val platformModule = module {
    single<SqlDriver> { NativeSqliteDriver(PeopleInSpaceDatabase.Schema, "peopleinspace.db") }
}