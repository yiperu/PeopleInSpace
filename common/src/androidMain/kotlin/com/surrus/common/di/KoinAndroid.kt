package com.surrus.common.di

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import com.surrus.common.repository.appContext
import com.surrus.peopleinspace.db.PeopleInSpaceDatabase
import org.koin.dsl.module

actual val platformModule = module {
    single<SqlDriver> { AndroidSqliteDriver(PeopleInSpaceDatabase.Schema, appContext, "peopleinspace.db") }
}