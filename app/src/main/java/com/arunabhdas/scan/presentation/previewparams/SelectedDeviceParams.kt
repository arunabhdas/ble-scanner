package com.arunabhdas.scan.presentation.previewparams

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.arunabhdas.scan.domain.models.BleConnectEvents
import com.arunabhdas.scan.domain.models.BleReadWriteCommands
import com.arunabhdas.scan.domain.models.ConnectionState
import com.arunabhdas.scan.domain.models.DeviceEvents
import com.arunabhdas.scan.domain.models.ScanState
import com.arunabhdas.scan.domain.models.ScanUI
class DevicePortraitParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    emptyList(),
                    deviceDetail,
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
    )
}
class DeviceLandscapeParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    emptyList(),
                    deviceDetail,
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
            landscapeNormal
        )
    )
}
class DeviceBigParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    emptyList(),
                    deviceDetail,
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
            landscapeBig
        )
    )
}
