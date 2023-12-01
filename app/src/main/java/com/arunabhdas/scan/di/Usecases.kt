package com.arunabhdas.scan.di

import com.arunabhdas.scan.domain.usecases.ParseDescriptor
import com.arunabhdas.scan.domain.usecases.ParseNotification
import com.arunabhdas.scan.domain.usecases.ParseRead
import com.arunabhdas.scan.domain.usecases.ParseScanResult
import com.arunabhdas.scan.domain.usecases.ParseService
import org.koin.dsl.module

val usecasesModule = module {

    single { ParseScanResult(get()) }
    single { ParseService(get()) }
    single { ParseRead() }
    single { ParseNotification() }
    single { ParseDescriptor() }

}