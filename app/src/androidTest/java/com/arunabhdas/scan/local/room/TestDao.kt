package com.arunabhdas.scan.local.room

import androidx.room.Dao
import androidx.room.Insert
import com.arunabhdas.scan.local.entities.BleCharacteristic
import com.arunabhdas.scan.local.entities.Company
import com.arunabhdas.scan.local.entities.Descriptor
import com.arunabhdas.scan.local.entities.MicrosoftDevice
import com.arunabhdas.scan.local.entities.Service

@Dao
interface TestDao {

    @Insert
    fun insertServices(services: List<Service>)

    @Insert
    fun insertCompanies(companies: List<Company>)

    @Insert
    fun insertMicrosoftDevices(devices: List<MicrosoftDevice>)

    @Insert
    fun insertCharacteristics(characteristics: List<BleCharacteristic>)

    @Insert
    fun insertDescriptors(descriptor: List<Descriptor>)

}