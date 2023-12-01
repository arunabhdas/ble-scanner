package com.arunabhdas.scan.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.arunabhdas.scan.local.BleDao
import com.arunabhdas.scan.local.Converters
import com.arunabhdas.scan.local.entities.BleCharacteristic
import com.arunabhdas.scan.local.entities.Company
import com.arunabhdas.scan.local.entities.Descriptor
import com.arunabhdas.scan.local.entities.MicrosoftDevice
import com.arunabhdas.scan.local.entities.ScannedDevice
import com.arunabhdas.scan.local.entities.Service

@Database(
    entities = [Company::class, Service::class, BleCharacteristic::class, MicrosoftDevice::class,
        ScannedDevice::class, Descriptor::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class TestBleDatabase : RoomDatabase() {
    abstract fun bleDao(): BleDao
    abstract fun testDao(): TestDao
}
