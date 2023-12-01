package com.arunabhdas.sharedtest

import com.arunabhdas.scan.domain.models.BleConnectEvents
import com.arunabhdas.scan.domain.models.BleReadWriteCommands
import com.arunabhdas.scan.domain.models.ConnectionState
import com.arunabhdas.scan.domain.models.DeviceEvents
import com.arunabhdas.scan.domain.models.ScanState
import com.arunabhdas.scan.domain.models.ScanUI
import com.arunabhdas.scan.presentation.previewparams.FeatureParams
import com.arunabhdas.scan.presentation.previewparams.devices
import com.arunabhdas.scan.presentation.previewparams.portrait

val scanStatePortrait = FeatureParams(
    ScanState(
    ScanUI(
        devices,
        null,
        ConnectionState.CONNECTING,
        null,
        null),
    BleConnectEvents({}, {}),
    BleReadWriteCommands(
        {},
        { _: String, _: String -> },
        { _: String, _: String -> },
        { _: String, _: String, _: String -> },
    ),
    DeviceEvents({}, {}, {},{},{})
),
devices,
deviceDetail,
portrait
)