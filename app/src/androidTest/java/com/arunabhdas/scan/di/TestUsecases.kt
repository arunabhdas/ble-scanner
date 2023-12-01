package com.arunabhdas.scan.di

import com.arunabhdas.scan.domain.usecases.ParseDescriptor
import com.arunabhdas.scan.domain.usecases.ParseNotification
import com.arunabhdas.scan.domain.usecases.ParseRead
import com.arunabhdas.scan.domain.usecases.ParseScanResult
import com.arunabhdas.scan.domain.usecases.ParseService
import com.arunabhdas.scan.local.room.TestBleDatabase
import org.koin.dsl.module

val testUsecasesModule = module {

    scope<TestBleDatabase> {
        scoped { ParseScanResult(get()) }
        scoped { ParseService(get()) }
    }

    single { ParseRead() }
    single { ParseNotification() }
    single { ParseDescriptor() }
}

