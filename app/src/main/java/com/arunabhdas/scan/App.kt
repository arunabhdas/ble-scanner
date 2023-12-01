package com.arunabhdas.scan

import android.app.Application
import com.arunabhdas.scan.di.appModule
import com.arunabhdas.scan.di.databaseModule
import com.arunabhdas.scan.di.usecasesModule
import com.arunabhdas.scan.utils.logging.DebugTree
import com.arunabhdas.scan.utils.logging.ReleaseTree
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class SanTanScanApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        } else
            Timber.plant(ReleaseTree())

        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@SanTanScanApp)
            workManagerFactory()
            // Load modules
            modules(appModule, databaseModule, usecasesModule)
        }

    }
}

