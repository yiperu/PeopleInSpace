package com.surrus.common.di

import com.surrus.common.remote.PeopleInSpaceApi
import com.surrus.common.repository.PeopleInSpaceRepository
import com.surrus.peopleinspace.db.PeopleInSpaceDatabase
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(platformModule, commonModule)
}

// called by iOS etc
fun initKoin() = initKoin{}

val commonModule = module {
    single { PeopleInSpaceRepository() }
    single { PeopleInSpaceApi() }
    single { PeopleInSpaceDatabase(get()) }
}

expect val platformModule: Module