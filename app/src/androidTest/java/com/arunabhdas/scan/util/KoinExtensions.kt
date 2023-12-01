package com.arunabhdas.scan.util

import android.util.Log
import com.arunabhdas.scan.local.room.TestBleDatabase
import com.arunabhdas.sharedtest.characteristics
import com.arunabhdas.sharedtest.companies
import com.arunabhdas.sharedtest.descriptors
import com.arunabhdas.sharedtest.msDevices
import com.arunabhdas.sharedtest.services
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class KoinTestPerMethod(
    private val bleDatabase: TestBleDatabase
): BeforeEachCallback, AfterEachCallback {
    override fun beforeEach(context: ExtensionContext?) {
        Log.d("debugTest", "Inserting prepopulated data...")
        with(bleDatabase.testDao()) {
            insertServices(services)
            insertCompanies(companies)
            insertMicrosoftDevices(msDevices)
            insertCharacteristics(characteristics)
            insertDescriptors(descriptors)
        }
    }

    override fun afterEach(context: ExtensionContext?) {
        Log.d("debugTest", "Closing db...")
        bleDatabase.close()
    }


}